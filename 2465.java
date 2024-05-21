// // 2465. Number of Distinct Averages

// class Solution {
//     public int distinctAverages(int[] nums) {
//         Arrays.sort(nums);
//         int i=0,j=nums.length-1;
//         HashSet<Double> set=new HashSet<>();
//         while(i<j){
//             set.add( (double)(nums[i]+nums[j])/(double)(2));
//             i++;j--;
//         }
//         return set.size();
//     }
// }