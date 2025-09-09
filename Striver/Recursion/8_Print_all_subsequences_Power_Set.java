// class Solution {
//     public List<List<Integer>> subsets(int[] nums) {
//         HashSet<List<Integer>> ans = new HashSet<>();
//         solve(0,nums,new ArrayList<>() , ans);
//         return new ArrayList<>(ans);
//     }
//     public void solve(int ind , int []nums , List<Integer> ds , Set<List<Integer>> ans){
//         if(ind==nums.length){
//             ans.add(new ArrayList<>(ds));
//             return;
//         }
//         ans.add(new ArrayList<>(ds));
//         solve(ind+1, nums , ds, ans);

//         ds.add(nums[ind]);
//         solve(ind+1, nums , ds, ans);
//         ds.remove(ds.size()-1);
    
//     }
// }