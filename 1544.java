// // 1544. Make The String Great

// class Solution {
//     public String makeGood(String s) {

//         // // stack

//         Stack<Character> st=new Stack<>();
//         for( char ch : s.toCharArray() ){
//             if( st.size()>0 && com( ch , st.peek() ) ){
//                 st.pop();
//             }
//             else{
//                 st.add(ch);
//             }
//         }

//         StringBuilder sb=new StringBuilder();
//         while(st.size()>0) sb.append(st.pop());

//         return sb.reverse().toString();
//     }
//     boolean com(char ch1,char ch2){
//         if(ch1==ch2) return false;
//         String s1= (ch1+"").toLowerCase();
//         String s2= (ch2+"").toLowerCase();
//         return s1.equals(s2);
//     }
// }




// /*

// // //brute force
// class Solution {
//     public String makeGood(String s) {
//         StringBuilder sb= new StringBuilder(s);
//         while( sb.length()>1 && is(sb.toString())  ){
//             for(int i=0;i<sb.length();i++){
//                 if(i+1<sb.length() && com(sb.charAt(i) , sb.charAt(i+1)) ){
//                     sb.deleteCharAt(i);
//                     sb.deleteCharAt(i);
//                     break;
//                 }
//             }
//         }
//         return sb.toString();
//     }
//     boolean com(char ch1,char ch2){
//         if(ch1==ch2) return false;
//         String s1= (ch1+"").toLowerCase();
//         String s2= (ch2+"").toLowerCase();
//         return s1.equals(s2);
//     }
//     boolean is(String s){
//         for(int i=0;i<s.length();i++){
//             if( i+1<s.length() && com(s.charAt(i),s.charAt(i+1)) ) return true;
//         }
//         return false;
//     }
// }

// */