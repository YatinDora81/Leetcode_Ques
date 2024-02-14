// // 2149. Rearrange Array Elements by Sign
// class Solution {
//     public int[] rearrangeArray(int[] nums) {
//         List<Integer> p=new ArrayList<>();
//         List<Integer> n=new ArrayList<>();
//         for(int i : nums){
//             if(i<0) n.add(i);
//             else p.add(i);
//         }
//         for(int i=0;i<nums.length/2;i++){
//             nums[2*i]=p.get(i);    
//             nums[2*i+1]=n.get(i);
//         }
//         return nums;
//     }
// }