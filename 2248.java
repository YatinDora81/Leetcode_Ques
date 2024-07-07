// // 2248. Intersection of Multiple Arrays

// class Solution {
//     public List<Integer> intersection(int[][] nums) {
//         List<Integer> ll = new ArrayList<>();
//         for(int i=0;i<nums[0].length;i++) ll.add(nums[0][i]);
//         for(int i=1;i<nums.length;i++) ll = common(ll, nums[i]);
//         Collections.sort(ll);
//         return ll;
//     }
//     List<Integer> common(List<Integer> ll , int []arr){
//         List<Integer> ans = new ArrayList<>();
//         HashSet<Integer> set = new HashSet<>();
//         for(int i: arr) set.add(i);
//         for(int i: ll) if(set.contains(i)) ans.add(i);
//         return ans;
//     }
// }