// class Solution {
//     public List<Integer> findMissingElements(int[] nums) {
//         TreeSet<Integer> set = new TreeSet<>();
//         for(int i : nums) set.add(i);
//         int prev = -1;
//         List<Integer> ans = new ArrayList<>();
//         System.out.println(set);
//         for(int i : set){
//             if(prev==-1) prev = i;
//             else{
//                 if(i==prev+1){
//                     prev = i;
//                     continue;
//                 }
//         // System.out.println(prev+1 + " " + i);
//                 for(int j=prev+1;j<i;j++) ans.add(j);
//                 prev = i;
//             }
//         }
//         return ans;
//     }
// }