// class Solution {
//     public boolean checkOnesSegment(String s) {
//         boolean one = false;
//         for(int i=0;i<s.length();i++){
//             char ch = s.charAt(i);
//             if(ch=='1' && one && ( i==0 ? true : s.charAt(i-1)!=ch ) ) return false;
//             else if(ch=='1') one = true;
//         }
//         return true;
//     }
// }