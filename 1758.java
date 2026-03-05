// class Solution {
//     public int minOperations(String s) {
//         return Math.min( solve(s,0) , solve( (s.charAt(0)=='0' ? "1" : "0") + s.substring(1,s.length()) , 1 ) );
//     }
//     public int solve(String s,int c){
//         char start = s.charAt(0);
//         for(int i=0;i<s.length();i++){
//             if(i%2==0){
//                 if(s.charAt(i)!=start) c++;
//             }else{
//                 if(s.charAt(i)==start) c++;
//             }
//         }
//         return c;
//     }
// }