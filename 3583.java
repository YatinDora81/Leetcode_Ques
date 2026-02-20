// class Solution {
//     public int specialTriplets(int[] nums) {
//         int MOD = (int)(1e9+7);
//         HashMap<Integer,Integer> after = new HashMap<>();
//         for(int i : nums){
//             if(!after.containsKey(i)) after.put(i,0);
//             after.put(i,after.get(i)+1);
//         }

//         HashMap<Integer,Integer> before = new HashMap<>();
//         int ans = 0;

//         for(int i=0;i<nums.length;i++){
//             int b = nums[i];
//             if(after.get(b)==1) after.remove(b);
//             else after.put(b , after.get(b)-1 );

//             if(before.containsKey(b*2) && after.containsKey(b*2)){
//                 int a = before.get(b*2);
//                 int c = after.get(b*2);
//                 ans = (int)((ans%MOD + ((long)a*c)%MOD)%MOD);
//                 ans = ans % MOD;
//             }

//             if(!before.containsKey(b)) before.put(b,0);
//             before.put(b , before.get(b)+1); 
//         }
//         return ans;
//     }
// }