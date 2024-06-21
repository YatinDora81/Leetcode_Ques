// // 1021. Remove Outermost Parentheses

// class Solution {
//     public String removeOuterParentheses(String s) {
//         StringBuilder sb =new StringBuilder("");
//         boolean open = false;
//         Stack<Character> st = new Stack<>();
//         for(int i=0;i<s.length();i++){
//             char ch = s.charAt(i);
//             if(ch=='(' && open==false) open=true;
//             else if(ch=='(' && open){
//                 sb.append(ch);
//                 st.push(ch);
//             }
//             else if( ch==')' && open && st.size()==0 ) open=false;
//             else if( ch==')' && open && st.size()>0 ){
//                 st.pop();
//                 sb.append(')');
//             }
//         }
//         return sb.toString();
//     }
// }