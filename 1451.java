// // 1451. Rearrange Words in a Sentence

// class Solution {
//     public String arrangeWords(String text) {
//         String arr[] = text.trim().toLowerCase().split(" ");
//         Arrays.sort(arr , (s1,s2)->{
//             if(s1.length()-s2.length()<0) return -1;
//             else if( s1.length()-s2.length()>0 ) return 1;
//             return 0;
//         });
//         arr[0] = rep(arr[0]);
//         StringBuilder sb = new StringBuilder();
//         for(String ss : arr) sb.append(ss+" ");
//         return sb.toString().trim();
//     }
//     String rep(String s){
//         StringBuilder sb = new StringBuilder();
//         for(int i=0;i<s.length();i++){
//             if(i==0) sb.append( (s.charAt(i)+"").toUpperCase() );
//             else sb.append(s.charAt(i));
//         }
//         return sb.toString();
//     }
// }