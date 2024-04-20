// // 1684. Count the Number of Consistent Strings

// class Solution {
//     public int countConsistentStrings(String t, String[] words) {
//         HashSet<Character> set=new HashSet<>();
//         for(char ch : t.toCharArray()) set.add(ch);
//         int ans =0 ;
//         for(String s : words){
//             boolean f= true;
//             for(char ch : s.toCharArray()){
//                 if(!set.contains(ch)) f = false;
//             }
//             if(f) ans++;
//         }
//         return ans;
//     }
// }