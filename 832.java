// 832. Flipping an Image
class Solution {
    public int[][] flipAndInvertImage(int[][] nums) {
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length/2;j++){
                int temp=nums[i][j];
                nums[i][j]= ( nums[i][nums.length-1-j] ==1)  ? 0 : 1;
                nums[i][nums.length-1-j]= ( temp ==1 )  ? 0 : 1;
            }
            if(nums.length%2!=0) nums[i][nums.length/2]= ( nums[i][nums.length/2] == 1 ) ? 0 : 1;
        }
        return nums;
    }
}