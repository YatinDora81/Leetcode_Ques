// // 238. Product of Array Except Self

// class Solution {
//     public int[] productExceptSelf(int[] nums) {
//         //multiply left of and multiply right of curr approach
//         int n = nums.length;
//         int left[] = new int[n];
//         int right[] = new int[n];
//         Arrays.fill(left,1);
//         Arrays.fill(right,1);
//         int pro=nums[0];

//         for(int i=1;i<n;i++){
//             left[i] = pro ;
//             pro = pro * nums[i];
//         }


//         pro = nums[n-1];
//         for(int i = n-2;i>=0;i--){
//             right[i] = pro;
//             pro = pro * nums[i];
//         }


//         int ans[] =new int[n];
//         for(int i=0;i<n;i++){
//             ans[i] = left[i] * right[i];
//         } 

//         return ans;
//     }
// }