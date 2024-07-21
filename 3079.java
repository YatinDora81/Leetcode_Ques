// // 3079. Find the Sum of Encrypted Integers

// class Solution {
//     public int sumOfEncryptedInt(int[] nums) {
//         int ans =0 ;
//         for(int i : nums){
//                 String s = ""+ i;
//                 StringBuilder sb = new StringBuilder("");
//                 char ch = s.charAt(0);
//                 for(char c : s.toCharArray()) if(c>ch) ch = c;
//                 for(int j=0;j<s.length();j++) sb.append(ch);
//                 ans += Integer.parseInt(sb.toString());
//         }
//         return ans;
//     }
// }