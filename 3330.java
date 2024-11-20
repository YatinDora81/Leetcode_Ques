// // 3330. Find the Original Typed String I

// class Solution {
//     public class pair{
//         char ch ;
//         int c;
//         public pair(char ch , int c){
//             this.ch = ch;
//             this.c = c;
//         }
//     }
//     public int possibleStringCount(String s) {
//         List<pair> ll = new ArrayList<>();
//         int  i =0;
//         while(i<s.length()){
//             char ch  = s.charAt(i);
//             int c = 1;
//             int j = i +1 ;
//             while(j<s.length() && ch == s.charAt(j)){
//                 j++;
//                 c++;
//             }
//             i = j;
//             ll.add(new pair(ch , c));
//         }

//         int ans = 1;
//         for(pair p : ll){
//             ans += p.c - 1;
//         }
//         return ans;
//     }
// }