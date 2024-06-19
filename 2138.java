// // 2138. Divide a String Into Groups of Size k

// class Solution {
//     public String[] divideString(String s, int k, char fill) {
//         StringBuilder sb = new StringBuilder();
//         List<String> ll = new ArrayList<>();
//         for(int i=0;i<s.length();i++){
//             sb.append(s.charAt(i));
//             if( (i+1)%k==0 ){
//                 ll.add(sb.toString());
//                 sb = new StringBuilder();
//             }
//         }

//         if(sb.length()>0){
//             int n = k-sb.length();
//             for(int i=0;i<n;i++){
//                 sb.append(fill);
//             }
//             ll.add(sb.toString());
//         }

//         String ans[] = new String[ll.size()];
//         for(int i=0;i<ans.length;i++) ans[i] = ll.get(i);
//         return ans;
//     }
// }