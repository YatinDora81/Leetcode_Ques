// 2894. Divisible and Non-divisible Sums Difference
class Solution {
    public int differenceOfSums(int n, int m) {
        int ans[]={0,0};
        for(int i=1;i<=n;i++){
            if(i%m!=0) ans[0]+=i;
            else ans[1]+=i;
        }
        return ans[0]-ans[1];
    }
}