// class Solution {
//     public List<List<Integer>> combinationSum3(int k, int n) {
//         List<List<Integer>> ans = new ArrayList<>();
//         List<Integer> ds = new ArrayList<>();
//         solve(1, k, n, ds, ans);
//         return ans;
//     }

//     public void solve(int ind, int k, int n, List<Integer> ds, List<List<Integer>> ans) {
//         if(ind>9 || ds.size()>k || n<=0){
//             if(ds.size()==k && n==0) ans.add(new ArrayList<>(ds));
//             return;
//         }
        
//         solve(ind + 1, k, n, ds, ans);
//         ds.add(ind);
//         solve(ind + 1, k, n - ind, ds, ans);
//         ds.remove(ds.size() - 1);
//     }
// }