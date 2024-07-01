// // 1750. Minimum Length of String After Deleting Similar Ends

// class Solution {
//     public int minimumLength(String s) {
//         int i=0,j=s.length()-1;
//         while(i<=j){
//             if(i==j) return 1;
//             if(s.charAt(i)==s.charAt(j)){

//                 int k=i+1;
//                 while( k<s.length() && s.charAt(i) == s.charAt(k) ){
//                     k++;
//                 }
//                 i=k;
//                 k=j-1;
//                 while(k>=0 && s.charAt(j)==s.charAt(k)){
//                     k--;
//                 }
//                 j=k;

//             }
//             else return j-i+1;
//         }
//         return 0;
//     }
// }