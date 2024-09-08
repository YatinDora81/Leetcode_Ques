// // 347. Top K Frequent Elements

// class Solution {
//     public int[] topKFrequent(int[] nums, int k) {
//         HashMap<Integer,Integer> map = new HashMap<>();
//         for(int i : nums){
//             if(map.containsKey(i)) map.put(i , map.get(i)+1 );
//             else map.put(i,1);
//         }
//         List<Integer> all = new ArrayList<>();
//         for(int i: map.keySet()){
//             all.add(i);
//         }

//         Collections.sort(all , (a,b)->{
//             int freq1 = map.get(a);
//             int freq2 = map.get(b);
//             if(freq1-freq2>0) return -1;
//             else if(freq1-freq2<0) return 1;
//             return 0;
//         });

//         int ans[] = new int[k];
//         for(int i=0;i<k;i++){
//             ans[i] = all.get(i);
//         }
//         return ans;
//     }
// }