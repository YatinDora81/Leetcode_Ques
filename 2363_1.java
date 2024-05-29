// // 2363. Merge Similar Items

// class Solution {
//     public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
//         List<List<Integer>> ans=new ArrayList<>();
//         TreeMap<Integer,Integer> map=new TreeMap<>();

//         for(int item[] : items1){
//             map.put( item[0] , item[1] );   
//         }
//         for(int item[] : items2){
//             if(map.containsKey(item[0])) map.put( item[0] , map.get(item[0]) + item[1] );
//             else map.put( item[0] , item[1] );   
//         }
//         for(int i : map.keySet()){
//             List<Integer> ll = new ArrayList<>();
//             ll.add(i);
//             ll.add(map.get(i));
//             ans.add(ll);
//         }
//         return ans;
//     }
// }