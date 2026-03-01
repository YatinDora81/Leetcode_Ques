// class Solution {
//     public int[] minDistinctFreqPair(int[] nums) {
//         HashMap<Integer,Integer> map = new HashMap<>();
//         HashMap<Integer,Integer> map2 = new HashMap<>();

//         for(int i : nums){
//             if(!map.containsKey(i)) map.put(i,0);
//             map.put(i,map.get(i)+1);
//         }

//         List<Integer> ll = new ArrayList<>(map.keySet());
//         Collections.sort(ll);
//         for(int i=0;i<ll.size()-1;i++){
//             for(int j=i+1;j<ll.size();j++){
//                 int a = map.get(ll.get(i));
//                 int b = map.get(ll.get(j));

//                 if(a!=b){
//                     return new int[]{ll.get(i),ll.get(j)};
//                 }
                
//             }
//         }

//         return new int[]{-1,-1};
        
//         // for(int i : map.keySet()){
//         //     int freq = map.get(i);
//         //     if(!map2.containsKey(freq)) map2.put(freq,i);
//         //     else{
//         //         if(map2.get(freq)>i) map2.put(freq,i);
//         //     }
//         // }

//         // System.out.println(map2);
    
//     }
// }