// // 2073. Time Needed to Buy Tickets

// class Solution {
//     public int timeRequiredToBuy(int[] nums, int k) {
//         Queue<Integer> q=new LinkedList<>();
//         for(int i=0;i<nums.length;i++) q.add(i);
//         int ans=0;
//         while(q.size()>0){
//             int curr = q.remove();
//             if(nums[curr]!=0){
//                 nums[curr] -= 1;
//                 q.add(curr);
//                 ans++;
//             }
//             if(curr==k && nums[curr]==0) return ans;
//         }
//         return ans;
//     }
// }