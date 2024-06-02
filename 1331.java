// // 1331. Rank Transform of an Array

// class Solution {
//     public int[] arrayRankTransform(int[] nums) {
//         int arr[] = new int[nums.length];
//         for(int i=0;i<nums.length;i++) arr[i] = nums[i];
//         Arrays.sort(arr);

//         int r = 1;
//         HashMap<Integer,Integer> map=new HashMap<>();
//         for(int i=0;i<arr.length;i++){
//             if(!map.containsKey(arr[i])) map.put(arr[i] , r++);
//             // r++;
//         }
//         int ans[] = new int[nums.length];
//         for(int i=0;i<ans.length;i++){
//             ans[i] = map.get(nums[i]);
//         }
//         // System.out.print(map);
//         return ans;
//     }
// }