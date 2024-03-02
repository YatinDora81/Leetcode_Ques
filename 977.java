// 977. Squares of a Sorted Array
class Solution {
    public int[] sortedSquares(int[] nums) {
        int ans[]=new int[nums.length];
        int s=0;
        int e=nums.length-1;
        for(int i=nums.length-1;i>=0 ;i--){
            if(nums[s]*nums[s] >= nums[e]*nums[e]){
                ans[i]= nums[s]*nums[s];
                s++;
            }
            else{
                ans[i] = nums[e] * nums[e];
                e--;
            }
        }
        return ans;
    }
}