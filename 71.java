// // 71. Simplify Path

// class Solution {
//     public String simplifyPath(String s) {
//         List<String> ll = new ArrayList<>();
//         StringBuilder sb = new StringBuilder("");
//         for(int i=1;i<s.length();i++){
//             if(i>0 && s.charAt(i)=='/' && s.charAt(i-1)=='/') continue;
//             sb.append(s.charAt(i));
//         }
//         while(sb.length()>0 && sb.charAt(sb.length()-1)=='/') sb.deleteCharAt(sb.length()-1);
//         String []arr = sb.toString().split("/");

//         for(String t : arr){
//             if(t.equals("...")) ll.add(t);
//             else if(t.equals("..") && ll.size()>0) ll.remove(ll.size()-1);
//             else if(t.equals("..") && ll.size()==0) continue;
//             else if(t.equals(".")) continue;
//             else ll.add(t);
//         }
//         sb = new StringBuilder("/");
//         for(int i=0;i<ll.size();i++){
//             if(i==0) sb.append(ll.get(i));
//             else sb.append("/" + ll.get(i));
//         }

//         return sb.toString();
//     }
// }