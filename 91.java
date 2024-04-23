// // 91. Decode Ways

// class Solution {
//     public int numDecodings(String s) {
//         int dp[]=new int[s.length()+1];
//         Arrays.fill(dp,-1);
//         return tell(0,s,dp);
//     }
//     int tell(int ind,String s,int dp[]){
//         if(ind>=s.length()) return 1;
//         if(dp[ind]!=-1) return dp[ind];
//         int ans =0 ;
//         if(s.charAt(ind)!='0'){
//             ans = ans + tell(ind+1,s,dp);
//         }
//         if(ind+1<s.length() && s.charAt(ind)!='0' &&  cor(s.charAt(ind),s.charAt(ind+1)) ){
//             ans = ans + tell(ind+2,s,dp);
//         }
//         return dp[ind]=ans;
//     }
//     boolean cor(char ch1,char ch2){
//         if(ch1>='2' && ch2>='7') return false;
//         if(ch1>'2') return false;
//         return true;
//     }
// }