// // 1863. Sum of All Subset XOR Totals

// class Solution {
//     public int subsetXORSum(int[] nums) {
//         int []ans={0};
//         List<Integer> ll =new ArrayList<>();
//         tell(0,nums,ans,ll);
//         return ans[0];
//     }
//     void tell(int ind,int nums[],int ans[], List<Integer> ll){
//         if(ind==nums.length){
//             int a = 0;
//             for(int i=0;i<ll.size();i++){
//                 a= a ^ ll.get(i);
//             }
//             ans[0]+=a;
//             return;
//         }
//         ll.add(nums[ind]);
//         tell(ind+1,nums,ans,ll);
//         ll.remove(ll.size()-1);
//         tell(ind+1,nums,ans,ll);
//     }
// }