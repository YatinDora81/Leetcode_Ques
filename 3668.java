// class Solution {
//     public int[] recoverOrder(int[] nums, int[] fri) {
//         HashMap<Integer,Integer> map = new HashMap<>();
//         for(int i=0;i<nums.length;i++){
//             if(!map.containsKey(nums[i])) map.put(nums[i],i+1);
//         }
//         Integer arr[] = new Integer[fri.length];
//         for(int i=0;i<arr.length;i++){
//             arr[i] = fri[i];
//         }

//         Arrays.sort(arr , (a,b)->{
//             int c = map.get(a);
//             int d = map.get(b);
//             if(c-d<0) return -1;
//             else if(c-d>0) return 1;
//             return 0;
//         });
//         for(int i=0;i<arr.length;i++){
//             fri[i] = arr[i];
//         }
//         return fri;
//     }
// }