// 41. First Missing Positive

class Solution {
    public int firstMissingPositive(int[] nums) {
        //cyclic sort
        int i =0 , n =nums.length;
        while(i<n){
            int pos = nums[i] - 1;
            if(nums[i]>0 && nums[i]<=n && nums[i]!=nums[pos]){
                int temp =nums[i];
                nums[i] = nums[pos];
                nums[pos]= temp;
            }
            else i++;
        }

        for(i=0;i<nums.length;i++) if(nums[i]!=i+1) return i+1;
        return n+1;
    }
}