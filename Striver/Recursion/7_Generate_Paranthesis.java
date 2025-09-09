// class Solution {
//     public List<String> generateParenthesis(int n) {
//         List<String> ll = new ArrayList<>();
//         solve( n,  0 , 0, ll , "");
//         return ll;
//     }
//     public void solve(int n , int o , int c , List<String> ll , String s){
//         if( n == o && c == n){
//             ll.add(s);
//             // System.out.println(s);
//             return;
//         }

//         if(o<n){
//             solve(n, o+1 , c , ll , s + '(');
//         }
//         if( o>c && c<n ){
//             solve(n, o , c+1 , ll , s + ')');
//         }

//     }
// }