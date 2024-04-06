// // 1249. Minimum Remove to Make Valid Parentheses

// class Solution {
//     public String minRemoveToMakeValid(String s) {
//         StringBuilder sb=new StringBuilder("");
//         Stack<Integer> st=new Stack<>();
//         for(int i=0;i<s.length();i++){
//             char ch=s.charAt(i);
//             if(ch=='('){
//                 st.push(i);
//                 sb.append(ch);
//             }
//             else if(ch==')'){
//                 if(st.size()==0) continue;
//                 else{
//                     st.pop();
//                     sb.append(ch);
//                 }
//             }
//             else{
//                 sb.append(ch);
//             }
//         }

//         for(int i=sb.length()-1;i>=0;i--){
//             if(st.size()<=0) break;
//             if(sb.charAt(i)=='('){
//                 sb.deleteCharAt(i);
//                 st.pop();
//             }
//         }

//         return sb.toString();
//     }
// }