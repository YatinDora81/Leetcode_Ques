// // 2696. Minimum String Length After Removing Substrings

// class Solution {
//     public int minLength(String s) {
//         Stack<Character> st  = new Stack<>();
//         for(char ch : s.toCharArray()){
//             if(  st.size()==0 ) st.push(ch);
//             else if( ch=='B' || ch=='D' ){
//                 if( ch=='B' && st.peek()=='A' ){
//                     st.pop();
//                 }
//                 else if( ch=='D' && st.peek()=='C' ){
//                     st.pop();
//                 }
//                 else{
//                     st.push(ch);
//                 }
//             }
//             else st.push(ch);
//         }
//         return st.size();
//     }
// }