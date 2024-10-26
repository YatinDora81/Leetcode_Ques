// // 2938. Separate Black and White Balls

// class Solution {
//     public long minimumSteps(String s) {
//         long ans = 0;
//         StringBuilder sb = new StringBuilder(s);
//         int i = 0 , j = sb.length()-1;
//         while(i<j){
//             while(j>=0 && sb.charAt(j)=='1') j--;
//             while(i<sb.length() && sb.charAt(i)=='0') i++;
//             if(i>=j) break;
//             sb.setCharAt(i , '0');
//             sb.setCharAt(j , '1');
//             // System.out.println( i + " - " + j);
//             ans += j-i;
//             i++;
//             j--;

//         }
//         return ans;
//     }
// }