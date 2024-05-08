// // 2363. Merge Similar Items

// class Solution {
//     public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
//         List<List<Integer>> ans=new ArrayList<>();
//         TreeMap<Integer,Integer> map=new TreeMap<>();

//         for(int arr[] : items1){
//             if(map.containsKey(arr[0])) map.put(arr[0] , map.get(arr[0])+arr[1] );
//             else map.put( arr[0] , arr[1] );
//         }
//         for(int arr[] : items2){
//             if(map.containsKey(arr[0])) map.put(arr[0] , map.get(arr[0])+arr[1] );
//             else map.put( arr[0] , arr[1] );
//         }

//         for( int i : map.keySet() ){
//             List<Integer> ll=new ArrayList<>();
//             ll.add(i);
//             ll.add(map.get(i));
//             ans.add(ll);
//         }
//         return ans;
//     }
// }