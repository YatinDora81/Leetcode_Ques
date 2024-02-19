// // 599. Minimum Index Sum of Two Lists

// class Solution {
//     public String[] findRestaurant(String[] arr1, String[] arr2) {
//         HashMap<String,Integer> map=new HashMap<>();
//         for(int i=0;i<arr2.length;i++) map.put(arr2[i],i);

//         List<String> ll=new ArrayList<>();
//         int ind=Integer.MAX_VALUE;

//         for(int i=0;i<arr1.length;i++){
//             if(map.containsKey(arr1[i])){
//                 int v=map.get(arr1[i]) + i;
//                 if(v<ind){
//                     ind=v;
//                 }
//             }
//         }

//         for(int i=0;i<arr1.length;i++){
//             if(map.containsKey(arr1[i])){
//                 int v=map.get(arr1[i]) + i;
//                 if(v==ind){
//                     ll.add(arr1[i]);
//                 }
//             }
//         }
//         String ans[]=new String[ll.size()];
//         for(int i=0;i<ans.length;i++){
//             ans[i]=ll.get(i);
//         }
//         return ans;
//     }
// }