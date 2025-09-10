// // User function Template for Java

// class Solution {
//     public static boolean checkSubsequenceSum(int N, int[] arr, int K) {
//         // code here
//         return solve(0,arr,K);
        
//     }
    
//     static boolean solve(int ind , int []arr , int k){
//         if(k==0) return true;
//         if(ind>=arr.length) return false;
//         boolean f = false;
//         if(k>=0){
//             f = solve(ind+1 , arr , k) || solve(ind+1 , arr , k - arr[ind]); 
//         }
//         return f;
//     }
// }
