// // 1047. Remove All Adjacent Duplicates In String

// class Solution {
//     public String removeDuplicates(String s) {
//         Stack<Character> st = new Stack<>();
//         for(char ch : s.toCharArray()){
//             if(st.size()>0 && st.peek()==ch) st.pop();
//             else st.push(ch);
//         }
//         StringBuilder sb = new StringBuilder();
//         while(st.size()>0) sb.append(st.pop());
//         return sb.reverse().toString();
//     }
// }