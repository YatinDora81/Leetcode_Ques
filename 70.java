// 70. Climbing Stairs
class Solution {
    public int climbStairs(int n) {
        return tell3(n);
    }
    private static int tell3(int n) {
        //most optimised
        if(n==0 || n==1 ) return 1;
        
        int prev=1;
        int prev2=1;

        for(int i=2;i<=n;i++){
            int curri=prev+prev2;
            prev2=prev;
            prev=curri;
        }

        return prev;
    }
}

/*
 
public int climbStairs(int n) {
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        return tell3(n,dp);
    }
    private static int tell3(int n,int []dp) {
        //most optimised
        if(n==0 || n==1 ) return 1;
        if(dp[n]!=-1) return dp[n];
        return dp[n]=tell3(n-1,dp) + tell3(n-2,dp);
    }

 */