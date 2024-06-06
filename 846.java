// // 846. Hand of Straights

// class Solution {
//     public boolean isNStraightHand(int[] nums, int k) {
//         if( nums.length%k!=0 ) return false;
//         TreeMap<Integer,Integer> map= new TreeMap<>();
//         for(int i : nums){
//             if(map.containsKey(i)) map.put(i,map.get(i)+1);
//             else map.put(i,1);
//         }

//         while(  map.size()>0 ){

//             Map.Entry<Integer,Integer> entry = map.entrySet().iterator().next();
//             int v = entry.getKey();
//             for(int i=0;i<k;i++){
//                 if(!map.containsKey(i+v)) return false;
//                 else{
//                     if(map.get(i+v)==1) map.remove(i+v);
//                     else map.put(i+v , map.get(i+v)-1);
//                 }
//             }
//         }
//         // System.out.print(map);
//         return true;
//     }
// }