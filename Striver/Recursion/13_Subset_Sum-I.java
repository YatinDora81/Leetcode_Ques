// class Solution {
//     public List<List<Integer>> subsets(int[] nums) {
//         List<List<Integer>> ans = new ArrayList<>();
//         List<Integer> ds = new ArrayList<>();
//         solve(0,nums, ds , ans);
//         return ans;
//     }
//     public void solve(int i, int nums[] ,List<Integer> ds,List<List<Integer>> ans ){
//         if(i==nums.length){
//             ans.add(new ArrayList<>(ds));
//             return ;
//         }
//         solve(i+1 , nums , ds , ans);
//         ds.add(nums[i]);
//         solve(i+1 , nums , ds , ans);
//         ds.remove(ds.size()-1);
//     }
// }