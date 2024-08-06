// // 2154. Keep Multiplying Found Values by Two

// class Solution {
//     public int findFinalValue(int[] nums, int og) {
//         HashSet<Integer> set = new HashSet<>();
//         for(int i : nums) set.add(i);
//         while(set.contains(og)) og=og*2;
//         return og;
//     }
// }