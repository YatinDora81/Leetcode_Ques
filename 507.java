// 507. Perfect Number
class Solution {
    public boolean checkPerfectNumber(int n) {
        int sum=0;
        for(int i=1;i<=n/2;i++) if(n%i==0) sum+=i;
        return (sum==n) ? true : false;
    }
}