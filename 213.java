// 213. House Robber II

class Solution {
    public int rob(int[] nums) {
        if(nums.length==1) return nums[0];
        if(nums.length<3){
            if(nums[0]>nums[1]) return nums[0];
            else return nums[1];
        }
        int arr1[]=new int[nums.length-1];
        int arr2[]=new int[nums.length-1];
        int l=0;
        for(int i=1;i<nums.length;i++){
            arr1[l]=nums[i];
            l++;
        }
        l=0;
        for(int i=0;i<nums.length-1;i++){
            arr2[l]=nums[i];
            l++;
        }
        return Math.max( tell(arr1)  , tell(arr2)  );
    }
    public int tell(int nums[] ){
        int prev1=nums[0];
        int prev2=0;
        for(int i=1;i<nums.length;i++){
            int take = nums[i] + prev2;
            int nottake= prev1;
            int curri = Math.max(take,nottake);
            prev2=prev1;
            prev1=curri;
        }
        return prev1;
    }
}