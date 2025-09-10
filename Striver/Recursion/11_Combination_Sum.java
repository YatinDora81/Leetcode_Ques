// class Solution {
//     public List<List<Integer>> combinationSum(int[] arr, int k) {
//         HashSet<List<Integer>> ans = new HashSet<>();
//         solve(0 , arr , k , new ArrayList<>(),ans);
//         return new ArrayList<>(ans);
//     }
//     void solve(int ind , int []arr , int k , List<Integer> ds , HashSet<List<Integer>> ans){
//         if(k==0) ans.add(new ArrayList<>(ds));
//         if(ind>=arr.length) return ;

//         if(k>=0){
//             ds.add(arr[ind]);
//             solve(ind , arr , k-arr[ind] , ds , ans);
//             ds.remove(ds.size()-1);
//         }
//         solve(ind+1 , arr , k , ds , ans);

//     }
// }