// // 1296. Divide Array in Sets of K Consecutive Numbers

// class Solution {
//     public boolean isPossibleDivide(int[] nums, int k) {
//         if(nums.length%k!=0) return false;
//         TreeMap<Integer,Integer> map=new TreeMap<>();

//         for(int i : nums){
//             if(map.containsKey(i)) map.put(i,map.get(i)+1);
//             else map.put(i,1);
//         }

//         while(map.size()>0){
//             Map.Entry<Integer,Integer> entry= map.entrySet().iterator().next();
//             int v = entry.getKey();
//             for(int i=0;i<k;i++){
//                 if(!map.containsKey(v+i)) return false;
//                 else{
//                     if(map.get(v+i)==1) map.remove(v+i);
//                     else map.put(v+i , map.get(v+i)-1);
//                 }
//             }
//         }

//         return true;
//     }
// }