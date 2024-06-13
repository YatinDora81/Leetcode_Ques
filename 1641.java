// // 1641. Count Sorted Vowel Strings

// class Solution {
//     public int countVowelStrings(int n) {
//         int dp[][] = new int[n+1][5];
//         for(int i[] : dp) Arrays.fill(i,-1);
//         return tell(0, n , ""  , 0 , dp);
//     }

//     int tell(int ind ,int n , String s , int c,int dp[][]){
//         if(ind==n){
//             // System.out.print(s + " , ");
//             return 1;
//         }
//         if(dp[ind][c]!=-1) return dp[ind][c];
//         String arr[] = {"a" , "e" , "i" , "o" , "u"};
        
//         int ans =0 ;
//         for(int i =  c ; i<5 ; i++){
//             ans += tell(ind+1 , n , s+arr[i] , i,dp);
//         }

//         return dp[ind][c]=ans;
//     }
// }