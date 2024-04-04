// // 1614. Maximum Nesting Depth of the Parentheses

// class Solution {
//     public int maxDepth(String s) {
//         int ans=0;
//         Stack<Character> st=new Stack<>();
//         for(char ch : s.toCharArray()){
//             if(ch=='(') st.push('(');
//             else if(ch==')' && st.size()>0) st.pop();
//             ans = Math.max(ans,st.size());
//         }
//         return ans;
//     }
// }