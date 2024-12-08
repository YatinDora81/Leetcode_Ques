// // 3304. Find the K-th Character in String Game I

// class Solution {
//     public char kthCharacter(int k) {
//         StringBuilder ans = new StringBuilder("a");
//         while(ans.length()<k){
//             int n = ans.length();
//             for(int i=0;i<n;i++){
//                 int c = (ans.charAt(i) - 'a' + 1)%26;
//                 ans.append( (char)(c + 'a') );
//             }
//         }
        
//         return ans.charAt(k-1);
//     }
// }