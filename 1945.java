// // 1945. Sum of Digits of String After Convert

// class Solution {
//     public int getLucky(String t, int k) {
//         StringBuilder sb = new StringBuilder("");
//         for(char ch  : t.toCharArray()) sb.append(ch - 'a' +1 + "");
//         while(k!=0){
//             int c = 0;
//             String s = sb.toString();
//             for(char ch : s.toCharArray()) c += Integer.parseInt(ch+"");
//             sb = new StringBuilder(c + "");
//             k--;
//         }
//         return Integer.parseInt(sb.toString());
//     }
// }