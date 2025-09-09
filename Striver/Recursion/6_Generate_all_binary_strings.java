// class Solution {
//     public List<String> validStrings(int n) {
//         List<String> ll = new ArrayList<>();
//         solve(n, 0 , ll, "");
//         return ll;
//     }
//     public void solve(int n , int i , List<String> ll , String s){
//         if(i==n){
//             ll.add(s);
//             return;
//         }
//         if(s.length()==0 || s.charAt(s.length()-1)!='0') solve(n , i +1 , ll , s + '0');
//         solve(n , i +1 , ll , s + '1');
//     }
// }