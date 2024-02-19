// // 500. Keyboard Row

// class Solution {
//     public String[] findWords(String[] words) {
//         List<String> ll=new ArrayList<>();
//         String upp="qwertyuiop" ,mid="asdfghjkl" , low="zxcvbnm";
//         for(String s : words){
//             if( tell(s.toLowerCase(),upp) || tell(s.toLowerCase(),mid) || tell(s.toLowerCase(),low) ) ll.add(s);
//         }
//         String ans[]=new String[ll.size()];
//         for(int i=0;i<ll.size();i++) ans[i]=ll.get(i);
//         return ans;
//     }
//     boolean tell(String s1,String s2){
//         for(char ch : s1.toCharArray()) if(!s2.contains(ch+"")) return false;
//         return true;
//     }
// }