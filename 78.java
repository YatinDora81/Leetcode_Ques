// // 78. Subsets

// class Solution {
//     public List<List<Integer>> subsets(int[] nums) {
//         List<List<Integer>> ans =  new ArrayList<>();
//         List<Integer> ds=new ArrayList<>();
//         tell(0,nums,ds,ans);
//         return ans;
//     }
//     void tell(int ind , int []nums , List<Integer> ds , List<List<Integer>> ans){
//         if(ind==nums.length){
//             ans.add(new ArrayList<>(ds));
//             return;
//         }
//         tell(ind+1,nums,ds,ans);
//         ds.add(nums[ind]);
//         tell(ind+1,nums,ds,ans);
//         ds.remove(ds.size()-1);
//     }
// }