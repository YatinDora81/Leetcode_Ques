// // 1743. Restore the Array From Adjacent Pairs

// class Solution {
//     public int[] restoreArray(int[][] adj) {
//         HashMap<Integer,List<Integer>> map = new HashMap<>();
//         for(int []arr : adj){
//             int u = arr[0] , v = arr[1];
//             if(!map.containsKey(u)) map.put( u , new ArrayList<>() );
//             if(!map.containsKey(v)) map.put( v , new ArrayList<>() );
//             map.get(u).add(v);
//             map.get(v).add(u);
//         }

//         int start = -1;
//         for(int key : map.keySet()){
//             if( map.get(key).size()==1 ){
//                 start = key;
//                 break;
//             }
//         }

//         HashSet<Integer> set = new HashSet<>();
//         int ans[] = new int[map.size()];
//         ans[0] = start;
//         set.add(start);
//         for( int i= 1; i<ans.length; i++ ){
//             int prev = ans[i-1];
//             if(map.get(prev).size()>0 && !set.contains(map.get(prev).get(0))){
//                 ans[i] = map.get(prev).get(0);
//                 set.add( map.get(prev).get(0) );
//             }
//             else if( map.get(prev).size()>1 && !set.contains(map.get(prev).get(1)) ){
//                 ans[i] = map.get(prev).get(1);
//                 set.add( map.get(prev).get(1) );
//             }
//         }

//         return ans;
//     }
// }