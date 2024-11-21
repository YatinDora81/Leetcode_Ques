// // 3274. Check if Two Chessboard Squares Have the Same Color

// class Solution {
//     public boolean checkTwoChessboards(String s1, String s2) {
//         boolean isBlack1 = tell(s1);
//         boolean isBlack2 = tell(s2);
//         return isBlack1 == isBlack2;
//     }
//     public boolean tell(String s){
//         int indch = s.charAt(0) - 'a' + 1;
//         int indnum = Integer.parseInt(s.charAt(1) + "" );
//         if(indnum%2!=0){
//             if( indch % 2 !=0 ) return true;
//             else return false;
//         }
//         else{
//             if(indch%2==0) return true;
//             else return false;
//         }
//     }
// }