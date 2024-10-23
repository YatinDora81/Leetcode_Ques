// // 1209. Remove All Adjacent Duplicates in String II

// class Solution {
//     public String removeDuplicates(String s, int k) {
//         Stack<Pair> st = new Stack<>();
//         for (char ch : s.toCharArray()) {
//             if (!st.isEmpty() && st.peek().ch == ch) {
//                 st.peek().c++;
//             } else {
//                 st.push(new Pair(ch, 1));
//             }
//             if (st.peek().c == k) {
//                 st.pop();
//             }
//         }
        
//         StringBuilder sb = new StringBuilder();
//         while (!st.isEmpty()) {
//             Pair p = st.pop();
//             for (int i = 0; i < p.c; i++) {
//                 sb.append(p.ch);
//             }
//         }
//         return sb.reverse().toString();
//     }

//     class Pair {
//         char ch;
//         int c;

//         Pair(char ch, int c) {
//             this.ch = ch;
//             this.c = c;
//         }
//     }
// }