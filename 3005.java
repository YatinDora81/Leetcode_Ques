// // 3005. Count Elements With Maximum Frequency

// class Solution {
//     public int maxFrequencyElements(int[] nums) {
//         HashMap<Integer,Integer> map=new HashMap<>();
//         int maxi=-1;
//         for(int i : nums){
//             if(map.containsKey(i)) map.put(i,map.get(i)+1);
//             else map.put(i,1);
//             maxi=Math.max(maxi,map.get(i));
//         }
//         int ans=0;
//         for(int i : map.keySet()) if(map.get(i)==maxi) ans += maxi;
//         return ans;
//     }
// }