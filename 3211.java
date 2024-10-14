// // 3211. Generate Binary Strings Without Adjacent Zeros


// class Solution {
//     public List<String> validStrings(int n) {
//         List<String> ans = new ArrayList<>();
//         tell(0,n,"",ans,true);
//         return ans;
//     }
//     void tell(int ind,int n,String s,List<String> ll,boolean f){
//         if(ind==n){
//             ll.add(s);
//             return;
//         }
//         if(f) tell(ind+1,n,s+"0",ll,!f);
//         tell(ind+1,n,s+"1",ll,true);
//     }
// }