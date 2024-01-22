// 2733. Neither Minimum nor Maximum
/*
class Solution {
    public int findNonMinOrMax(int[] nums) {
        if(nums.length<3) return -1;
        Arrays.sort(nums);
        if(nums[nums.length-2] != nums[0] && nums[nums.length-1] !=nums[nums.length-2]) return nums[nums.length-2];
        return -1;
    }
}
*/