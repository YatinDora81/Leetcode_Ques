// // 1556. Thousand Separator

// class Solution {
//     public String thousandSeparator(int n) {
//         StringBuilder sb = new StringBuilder(n+"");
//         sb.reverse();
//         StringBuilder ans = new StringBuilder("");
        
//         int c = 1;
//         for(int i=0;i<sb.length();i++){
//             if(c==4){
//                 ans.append("." + sb.charAt(i));
//                 c = 2;
//             }
//             else{
//                 ans.append( sb.charAt(i));
//                 c++;
//             }
//         } 
//         return ans.reverse().toString();
//     }
// }