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