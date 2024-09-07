// // 921. Minimum Add to Make Parentheses Valid

// class Solution {
//     public int minAddToMakeValid(String s) {
//         int o = 0;
//         int c = 0;
//         for(char ch : s.toCharArray()){
//             if(ch=='(') o++;
//             else if(ch==')' && o>0) o-=1;
//             else c++;
//         }
//         return c+o;
//     }
// } 
