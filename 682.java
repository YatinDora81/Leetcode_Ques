// // 682. Baseball Game

// class Solution {
//     public int calPoints(String[] arr) {
//         Stack<Integer> st = new Stack<>();
//         for(String s : arr){
//             if( s.equals("C") || s.equals("D") || s.equals("+") ){
//                 if(s.equals("C")) st.pop();
//                 else if( s.equals("D") ){
//                     st.push( st.peek() * 2 );
//                 }
//                 else if( s.equals("+") ){
//                     int a = st.pop();
//                     int b = st.pop();
//                     st.push(b);
//                     st.push(a);
//                     st.push(a+b);
//                 }
//             }
//             else st.push( Integer.parseInt(s) );
//         }
//         int ans = 0;
//         while(st.size()>0) ans += st.pop();
//         return ans;
//     }
// }