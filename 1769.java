// // 1769. Minimum Number of Operations to Move All Balls to Each Box

// class Solution {
//     public int[] minOperations(String s) {
//         int ans[] = new int[s.length()];
//         List<Integer> ll = new ArrayList<>();
//         for(int i=0;i<s.length();i++){
//             if(s.charAt(i)=='1') ll.add(i);
//         }
//         for(int i=0;i<ans.length;i++){
//             int c = 0;
//             for(int j : ll){
//                 c += Math.abs( j-i );
//             }
//             ans[i] = c;
//         }
//         return ans;
//     }
// }