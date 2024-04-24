// 1137. N-th Tribonacci Number

class Solution {
    public int tribonacci(int n) {
        if(n==0) return 0;
        if(n<=2) return 1;
        // int dp[]=new int[n+1];

        int prev3=0;
        int prev2=1;
        int prev=1;

        for(int i=3;i<=n;i++){
            int curr= prev + prev2 + prev3;
            prev3 = prev2;
            prev2=prev;
            prev = curr;
        }

        return prev;
    }
    
}