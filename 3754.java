// class Solution {
//     public long sumAndMultiply(int n) {
//         if(n==0) return 0;
//         StringBuilder sb = new StringBuilder();
//         long sum = 0;
//         for(char ch : (n+"").toCharArray()){
//             if(ch!='0'){
//                 sb.append(ch);
//                 sum += (ch-'0');
//             }
//         }
//         return Long.parseLong(sb.toString()) * sum;
//     }
// }