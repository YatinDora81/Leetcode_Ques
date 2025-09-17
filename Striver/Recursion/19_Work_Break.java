// class Solution {
//     public boolean wordBreak(String s, List<String> wordDict) {
//         int dp[] = new int[s.length()];
//         Arrays.fill(dp,-1);
//         return solve(0, s, wordDict , dp);

//     }

//     public boolean solve(int ind, String s, List<String> ll , int []dp) {
//         if (ind == s.length()) {
//             return true;
//         }
//         if(dp[ind]!=-1) return dp[ind]==0 ? false : true;
//         boolean ans = false;
//         for (int i = 0; i < ll.size(); i++) {
//             if (isOk(s, ind, ll.get(i)))
//                 ans = ans || solve(ind + ll.get(i).length(), s, ll,dp);
//                 dp[ind] = ans==true ? 1 : 0;
//         }
//         return ans;
//     }
//     public boolean isOk(String s , int i, String t){
//         int j =0 , n = s.length() , m = t.length();
//         while(i<n && j<m){
//             if(s.charAt(i)!=t.charAt(j)) return false;
//             i++;
//             j++;
//         }
//         if(j<m) return false;
//         return true;
//     }
// }