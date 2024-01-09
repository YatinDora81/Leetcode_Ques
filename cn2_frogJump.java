// https://www.codingninjas.com/studio/problems/frog-jump_3621012?source=youtube&campaign=striver_dp_videos&leftPanelTabValue=PROBLEM


import java.util.*;

public class cn2_frogJump{
    public static void main(String[] args) {
        int n=4;
        int heights[]={10,20,30,10};

        // //1 simple recursion
        // int ans1=tell1(n-1,heights);
        // System.out.println(ans1);


        int dp[]=new int[n];
        Arrays.fill(dp, -1);

        // // memoization
        // int ans2=tell2(n-1,heights,dp);
        // System.out.println(ans2);

        // // tabulation
        // int ans3=tell3(n,heights,dp);
        // System.out.println(ans3);

        // // most optimised
        // int ans4=tell4(n,heights);
        // System.out.println(ans4);


    }

    private static int tell4(int n, int[] heights) {
        if(n==0) return 0;
        int prev1 = 0;
        int prev2 = 0;

        for(int i=1;i<n;i++){
            int fs= prev1 + Math.abs(heights[i] - heights[i-1] );
            int ss=Integer.MAX_VALUE;
            if(i>1) ss=prev2 + Math.abs(heights[i] - heights[i-2] );

            int curri=Math.min(fs, ss);
            prev2=prev1;
            prev1=curri;
        }

        return prev1;
    }

    private static int tell3(int n, int[] heights , int dp[]) {
        //tabulation
        if(n==0) return 0;
        
        dp[0]=0;

        for(int i=1;i<n;i++){
            int fs= dp[i-1] + Math.abs(heights[i] - heights[i-1] );
            int ss=Integer.MAX_VALUE;
            if(i>1) ss=dp[i-2] + Math.abs(heights[i] - heights[i-2] );

            dp[i]=Math.min(fs, ss);
        }
        
        return dp[n-1];
    }

    private static int tell2(int ind, int[] heights , int dp[]) {
        //memoization
        if(ind==0) return 0;
        
        if(dp[ind]!=-1) return dp[ind];

        int left= tell2(ind-1 , heights ,dp) + Math.abs(heights[ind] - heights[ind-1] );
        int right= Integer.MAX_VALUE;
        if(ind>1) right= tell2(ind-2 , heights , dp) + Math.abs(heights[ind] - heights[ind-2] );
        
        return dp[ind] = Math.min(left, right);
    }

    private static int tell1(int ind, int[] heights) {
        if(ind==0) return 0;
        
        int left= tell1(ind-1 , heights) + Math.abs(heights[ind] - heights[ind-1] );
        int right= Integer.MAX_VALUE;
        if(ind>1) right= tell1(ind-2 , heights) + Math.abs(heights[ind] - heights[ind-2] );
        
        return Math.min(left, right);
    }
}