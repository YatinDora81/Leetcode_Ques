// // 77. Combinations

// class Solution {
//     public List<List<Integer>> combine(int n, int k) {
//         List<List<Integer>> ans = new ArrayList<>();
//         int arr[] = new int[n];
//         for(int i=0;i<n;i++) arr[i] = i+1;
//         tell(0,arr,k,new ArrayList<>(),ans);
//         return ans;
//     }
//     void tell(int ind , int[] arr,int k , List<Integer> ds ,List<List<Integer>> ans  ){
//         if(ind==arr.length){
//             if(ds.size()==k) ans.add(new ArrayList<>(ds));
//             return;
//         }
//         if(ds.size()==k){
//             ans.add(new ArrayList<>(ds));
//             return;
//         }
//         tell(ind+1 , arr,k,ds,ans);
//         ds.add(arr[ind]);
//         tell(ind+1,arr,k,ds,ans);
//         ds.remove(ds.size()-1);
        
//     }
// }