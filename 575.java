// // 575. Distribute Candies

// class Solution {
//     public int distributeCandies(int[] arr) {
//         HashSet<Integer> set = new HashSet<>();
//         for(int i : arr){
//             set.add(i);
//             if(set.size()>=arr.length/2) return arr.length/2;
//         }

//         return set.size();
//     }
// }