// // 3289. The Two Sneaky Numbers of Digitville

// class Solution {
//     public int[] getSneakyNumbers(int[] nums) {
//         int l = 0;
//         int ans[] = {0,0};
//         HashSet<Integer> set = new HashSet<>();
//         for(int i : nums){
//             if(set.contains(i)) ans[l++] = i;
//             set.add(i);
//         }
//         return ans;
//     }
// }