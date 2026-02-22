// class Solution {
//     public String maximumXor(String s, String t) {
//         int o = 0;
//         for(char ch : t.toCharArray()) if(ch=='1') o++;
//         int z = t.length() - o;
        
//         int u1 = 0;
//         int u2 = 0;
//         StringBuilder sb = new StringBuilder();
//         for(int i=0;i<s.length();i++){
//             if(s.charAt(i)=='1'){
//                 if(u2<z){
//                     u2++;
//                     sb.append("1");
//                 } else{
//                     u1++;
//                     sb.append("0");
//                 }
//             } else{
//                 if(u1<o){
//                     u1++;
//                     sb.append("1");
//                 } else{
//                     u2++;
//                     sb.append("0");
//                 }
//             }
//         }
//         return sb.toString();
//     }
// }