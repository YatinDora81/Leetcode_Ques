// // 3046. Split the Array

// class Solution {
//     public boolean isPossibleToSplit(int[] nums) {
//         HashMap<Integer,Integer> map = new HashMap<>();
//         for(int i : nums){
//             if(map.containsKey(i)) map.put(i,map.get(i)+1);
//             else map.put(i,1);
//             if(map.get(i)>2) return false;
//         }
//         return map.size() >= nums.length / 2;
//     }
// } 