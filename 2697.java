// // 2697. Lexicographically Smallest Palindrome

// class Solution {
//     public String makeSmallestPalindrome(String s) {
//         StringBuilder sb=new StringBuilder("");
//         int i=0,j=s.length()-1;
//         while(i<=j){
//             if(s.charAt(i)==s.charAt(j)) sb.append(s.charAt(i));
//             else{
//                 char ch = (s.charAt(i)<s.charAt(j)) ? s.charAt(i) : s.charAt(j);
//                 sb.append(ch);
//             }
//             i++;
//             j--;
//         }
//         StringBuilder ans=new StringBuilder(sb);
//         if(s.length()%2!=0) ans.deleteCharAt(ans.length()-1);
//         ans.append(sb.reverse());
//         return ans.toString();
//     }
// }