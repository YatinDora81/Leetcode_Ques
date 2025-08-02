// class Solution {
//     public int longestConsecutive(int[] nums) {
//         if(nums.length==0) return 0;
//         TreeSet<Integer> set = new TreeSet<>();
//         for(int i : nums) set.add(i);
//         System.out.println(set);
//         int max = 1;
//         int last = Integer.MIN_VALUE;
//         int c = 1;
//         for(int i : set){
//             if(last+1 == i){
//                 c++;
//                 last = i;
//                 max = Math.max(max , c);
//             }
//             else{
//                 last = i;
//                 c = 1;
//             }
//         }
//         return max;
//     }
// }
