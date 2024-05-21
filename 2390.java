// // 2390. Removing Stars From a String

// class Solution {
//     public String removeStars(String s) {
//         Stack<Character> st=new Stack<>();
//         for(char ch : s.toCharArray()){
//             if(ch=='*' && st.size()>0) st.pop();
//             else st.push(ch);
//         }
//         StringBuilder sb=new StringBuilder();
//         while(st.size()>0) sb.append(st.pop());
//         return sb.reverse().toString();
//     }
// }