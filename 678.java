// // 678. Valid Parenthesis String

// class Solution {
//     public boolean checkValidString(String s) {

//         //we use extra star stack because it didnot check the case where * comes before '(' the it will not check that 
//         // example " **(( "

//         Stack<Integer> st=new Stack<>();
//         Stack<Integer> star=new Stack<>();
        
//         for(int i=0;i<s.length();i++){
//             char ch=s.charAt(i);
//             if(ch=='(') st.push(i);
//             else if(ch=='*') star.push(i);
//             else if(ch==')'){
//                 if(st.size()>0) st.pop();
//                 else if(st.size()==0 && star.size()>0) star.pop();
//                 else return false;
//             }
//         }
//         // System.out.print(st.size() + " " + star);
//         if(st.size()==0) return true;
        
//         if(st.size()>star.size()) return false;
        
//         while(st.size()>0){
//             if(st.peek()>star.peek()) return false;
//             st.pop();
//             star.pop();
//         }

//         return true;
//     }
// }