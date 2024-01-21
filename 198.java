// 198. House Robber

/*

class Solution {
    public int rob(int[] nums) {
        int dp[]=new int[nums.length];
        Arrays.fill(dp,-1);
        return tell(nums.length-1,nums,0,dp);
    }
    public int tell(int i , int []nums,int sum,int dp[]){
        //memoiation
        if(i==0) return nums[0];
        if(i<0) return 0;
        if(dp[i]!=-1) return dp[i];
        int take= nums[i] + tell(i-2,nums,sum+nums[i],dp);
        int nottake= 0 + tell(i-1,nums,sum,dp);

        return dp[i]=Math.max(take,nottake);
    }

    public int tell2(int []nums,int dp[]){
        //tabulation
        dp[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            int take= nums[i] + ( (i-2>=0) ? dp[i-2] : 0 );
            int nottake= 0 + ( (i-1>=0) ? dp[i-1] : 0);
            dp[i]=Math.max(take,nottake);
        }

        return dp[nums.length-1];
    }

    public int tell3(int []nums){
        //most optimized
        int prev1=nums[0];
        int prev2=0;
        for(int i=1;i<nums.length;i++){
            int take= nums[i] + prev2;
            int nottake= 0 + prev1;
            int curri=Math.max(take,nottake);
            prev2=prev1;
            prev1=curri;
        }

        return prev1;
    }
}

*/