// class Solution {
//     public int bitwiseComplement(int n) {
//         String s = Integer.toBinaryString(n);
//         StringBuilder sb = new StringBuilder("");
//         for(char ch : s.toCharArray()) sb.append(ch=='1' ? '0' : '1');
//         return Integer.parseInt(sb.toString(),2);
//     }
// }