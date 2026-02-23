// class Solution {
//     public boolean hasAllCodes(String s, int k) {
//         HashSet<String> set = new HashSet<>();
//         int i = 0, j = 0;
//         StringBuilder sb = new StringBuilder("");
//         while(j<s.length()){
//             sb.append(s.charAt(j++));
//             if(j-i<k) continue;
//             set.add(sb.toString());
//             sb.deleteCharAt(0);
//             i++;
//         }
//         // System.out.println(set);
//         return set.size()==Math.pow(2,k);
//     }
// }