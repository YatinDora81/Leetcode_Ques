// class Solution {
//     public String trimTrailingVowels(String s) {
//         StringBuilder sb = new StringBuilder("");
//         boolean can = true;
//         for(int i=s.length()-1;i>=0;i--){
//             if(!is(s.charAt(i)) || !can){
//                 can = false;
//                 sb.append(s.charAt(i));
//             }
//         }
//         return sb.reverse().toString();
//     }
//     public boolean is(char ch){
//         return ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u';
//     }
// }