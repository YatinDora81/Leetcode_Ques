// 268. Missing Number

class Solution {
    public int missingNumber(int[] nums) {
        int ans=0;
        for(int i : nums) ans= ans ^ i;
        for(int i=0;i<=nums.length;i++){
            ans=ans^i;
        }
        return ans;
    }
}