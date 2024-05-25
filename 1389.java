// // 1389. Create Target Array in the Given Order

// class Solution {
//     public int[] createTargetArray(int[] nums, int[] index) {
//         List<Integer> ll=new ArrayList<>();

//         for(int i=0;i<nums.length;i++){
//             ll.add( index[i] , nums[i] );
//         }
//         int arr[]=new int[ll.size()];
//         for(int i=0;i<arr.length;i++) arr[i] = ll.get(i);
//         return arr;
//     }
// }