// // 386. Lexicographical Numbers

// class Solution {
//     public List<Integer> lexicalOrder(int n) {
//         List<String> ll = new ArrayList<>();
//         for(int i=1;i<=n;i++) ll.add(i+"");
//         Collections.sort(ll);
//         List<Integer> ans = new ArrayList<>();
//         for(String i : ll) ans.add(Integer.parseInt(i));
//         return ans;
//     }
// }

// class Solution {
//     public List<Integer> lexicalOrder(int n) {
//         List<Integer> ans = new ArrayList<>();
//         tell( 0 , (n+"").length() , "" ,  n ,ans );
//         return ans;
//     }
//     void tell(int ind, int n , String s , int num , List<Integer> ll){
//         if( s.length()!=0 && Integer.parseInt(s)<=num) ll.add(Integer.parseInt(s));
//         if(ind==n){  
//             return;
//         }

//         for(int i = 0 ; i<=9;i++){
//             if(s.length()==0 && i==0) continue;
//             else tell(ind +1 , n , s + i , num , ll);
//         }
//     }
// }