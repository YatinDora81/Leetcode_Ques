// // 784. Letter Case Permutation

// class Solution {
//     public List<String> letterCasePermutation(String s) {
//         List<String> ans= new ArrayList<>();
//         tell(0,s,"",ans);
//         return ans;
//     }
//     void tell(int ind,String s,String t,List<String> ll){
//         if(ind==s.length()){
//             ll.add(t);
//             return;
//         }
//         if( isChar(s.charAt(ind)) ){
//             tell( ind+1 , s, t+( (s.charAt(ind)+"").toLowerCase() ) , ll );
//             tell( ind+1 , s, t+( (s.charAt(ind)+"").toUpperCase() ) , ll );
//         }
//         else tell(ind+1 , s, t+s.charAt(ind) , ll);
//     }
//     boolean isChar(char ch){
//         return (ch>='a' && ch<='z') || (ch>='A' && ch<='Z');
//     }
// }