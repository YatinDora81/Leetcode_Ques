// // 830. Positions of Large Groups

// class Solution {
//     public List<List<Integer>> largeGroupPositions(String s) {
//         List<List<Integer>> ans=new ArrayList<>();

//         for(int i=0;i<s.length();i++){
//             int c=0;
//             int j=i;
//             while( j<s.length() && s.charAt(i) == s.charAt(j) ){
//                 j++;
//                 c++;
//             }
//             if(c>2){
//                 List<Integer> ll=new ArrayList<>();
//                 ll.add(i);
//                 ll.add(j-1);
//                 ans.add(ll);
//                 i=j-1;
//             }
//         }
//         return ans;
//     }
// }