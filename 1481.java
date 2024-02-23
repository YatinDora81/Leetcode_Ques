// // 1481. Least Number of Unique Integers after K Removals

// class Solution {
//     public int findLeastNumOfUniqueInts(int[] arr, int k) {
//         HashMap<Integer,Integer> map=new HashMap<>();
//         List<Integer> ll=new ArrayList<>();
//         for(int i : arr){
//             ll.add(i);
//             if(map.containsKey(i)) map.put(i, map.get(i)+1);
//             else map.put(i,1);
//         }

//         Collections.sort(ll,(a1,a2)->{
//             int freq1= map.get(a1);
//             int freq2= map.get(a2);
//             if(freq1<freq2) return -1;
//             else if(freq1>freq2) return 1;
//             else{
//                 if(a1<a2) return -1;
//                 else if(a1>a2) return 1;
//                 return 0; 
//             }
//         });
//         System.out.print(ll);
//         HashSet<Integer> set=new HashSet<>();
//         for(int i=k;i<ll.size();i++) set.add(ll.get(i));
//         return set.size();
//     }
// }