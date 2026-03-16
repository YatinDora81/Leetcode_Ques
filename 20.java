// class Solution {
//     public boolean isValid(String s) {
//         Stack<Character> st = new Stack<>();
//         for(char ch : s.toCharArray()){
//             if(ch=='(' || ch=='[' || ch=='{'){
//                 st.push(ch);
//                 continue;
//             }

//             if(st.size()==0 || (ch==')' && st.peek()!='(') || (ch==']' && st.peek()!='[') || (ch=='}' && st.peek()!='{')) return false;
//             st.pop();
//         }
//         return st.size()==0;
//     }
// }