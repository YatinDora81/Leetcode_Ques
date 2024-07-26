// // 128. Longest Consecutive Sequence

// class Solution {
//     public int longestConsecutive(int[] nums) {
//         HashSet<Integer> set = new HashSet<>();
//         for(int i : nums) set.add(i);
//         int ans=0;
//         for(int i : nums){
//             if(!set.contains(i+1)){
//                 int c=1;
//                 int a=i;
//                 while(set.contains(a-1)){
//                     a--;
//                     c++;
//                 }
//                 ans = Math.max(c,ans);
//             }
//         }
//         return ans;
//     }
// }