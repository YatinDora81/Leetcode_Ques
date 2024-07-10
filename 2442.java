// // 2442. Count Number of Distinct Integers After Reverse Operations

// class Solution {
//     public int countDistinctIntegers(int[] nums) {
//         HashSet<Integer> set = new HashSet<>();
//         for(int i : nums) set.add(i);
//         for(int i : nums){
//             StringBuilder sb = new StringBuilder(i+"");
//             set.add( Integer.parseInt(sb.reverse().toString()) );
//         }
//         return set.size();
//     }
// }