// // 3158. Find the XOR of Numbers Which Appear Twice

// class Solution {
//     public int duplicateNumbersXOR(int[] nums) {
//         HashSet<Integer> set = new HashSet<>();
//         int ans =0;
//         for(int i : nums){
//             if(set.contains(i)) ans ^= i;
//             else set.add(i);
//         }
//         return ans;
//     }
// }