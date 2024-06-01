// // 1282. Group the People Given the Group Size They Belong To

// class Solution {
//     public List<List<Integer>> groupThePeople(int[] arr) {
//         List<List<Integer>> ans = new ArrayList<>();
//         TreeMap<Integer,List<Integer>> map=new TreeMap<>();

//         for(int i=0;i<arr.length;i++){
//             if( map.containsKey(arr[i]) ) map.get(arr[i]).add(i);
//             else{
//                 map.put(arr[i] , new ArrayList<>());
//                 map.get(arr[i]).add(i);
//             }
//         }

//         for(int key : map.keySet()){
//             List<Integer> temp = map.get(key);
//             int n = temp.size();
//             int i=0;
//             List<Integer> ll=new ArrayList<>();
//             while( i < n ){
//                 ll.add(temp.get(i));
//                 i++;
//                 if( ll.size() == key ){
//                     ans.add(ll);
//                     ll = new ArrayList<>();
//                 }
//             }
//         }

//         // System.out.print(map);
//         return ans;
//     }
// }