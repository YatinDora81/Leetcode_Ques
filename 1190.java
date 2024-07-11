// // 1190. Reverse Substrings Between Each Pair of Parentheses

// class Solution {
//     public String reverseParentheses(String s) {
//         Stack<Integer> st = new Stack<>();
//         StringBuilder sb = new StringBuilder("");

//         for(int i=0;i<s.length();i++){
//             if(s.charAt(i)=='(') st.push(sb.length());
//             else if(s.charAt(i)==')'){
//                 reverse(sb,st.pop(),sb.length()-1);
//             }
//             else{
//                 sb.append(s.charAt(i));
//             }
//         }
//         return sb.toString();
//     }
//     void reverse(StringBuilder sb , int start , int end){
//         while(start<end){
//             char t = sb.charAt(start);
//             sb.setCharAt(start , sb.charAt(end));
//             sb.setCharAt(end , t);
//             start++;
//             end--;
//         }
//     }
// }