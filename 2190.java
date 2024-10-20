// // 2190. Most Frequent Number Following Key In an Array

// class Solution {
//     public int mostFrequent(int[] nums, int key) {
//         HashMap<Integer,Integer> map= new HashMap<>();
//         int mc = 0;
//         int no = 0;
//         for(int i=1;i<nums.length;i++){
//             if(nums[i-1]==key){
//                 if(map.containsKey(nums[i])) map.put( nums[i] , map.get(nums[i])+1 );
//                 else map.put(nums[i] , 1);
//                 if( mc<map.get(nums[i]) ){
//                     no = nums[i];
//                     mc = map.get(nums[i]);
//                 }
//             }
//         }
//         return no;
//     }
// }