// // 3270. Find the Key of the Numbers

// class Solution {
//     public int generateKey(int num1, int num2, int num3) {
//         String s1 = give(num1) , s2 = give(num2) , s3 = give(num3);
//         StringBuilder sb = new StringBuilder("");
//         for(int i =0 ;i<4;i++){
//             sb.append( Math.min( Integer.parseInt( s1.charAt(i) + ""  ) ,  Math.min( Integer.parseInt( s2.charAt(i) +""  )  , Integer.parseInt( s3.charAt(i) + ""  ))  ) + "" );
//         }
//         return Integer.parseInt( sb.toString() );
//     }
//     public String give(int n){
//         StringBuilder sb = new StringBuilder("");
//         for(int i= 0 ; i<4-(n+"").length();i++) sb.append("0");
//         return sb.toString() + n;
//     } 
// }