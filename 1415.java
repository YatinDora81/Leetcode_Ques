// class Solution {
//     public String getHappyString(int n, int k) {
//         List<String> ll = new ArrayList<>();
//         solve("",n,ll);
//         return ll.size()>=k ? ll.get(k-1) : "";
//     }
//     public void solve(String s,int n,List<String> ll){
//         if(s.length()==n){
//             ll.add(new String(s));
//             return ;
//         }

//         for(char ch='a';ch<='c';ch++){
//             if(s.length()==0 || s.charAt(s.length()-1)!=ch) solve(s+ch,  n ,ll);
//         }
//     }
// }