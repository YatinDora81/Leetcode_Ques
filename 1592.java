// // 1592. Rearrange Spaces Between Words

// class Solution {
//     public String reorderSpaces(String s) {
//         List<String> ll = new ArrayList<>();
//         int i = 0 , n = s.length();
//         int space = 0;
//         while( i<n ){
//             if( s.charAt(i)!=' ' ){
//                 StringBuilder sb = new StringBuilder("");
//                 int j = i;
//                 while(j<n && s.charAt(j)!=' '){
//                     sb.append(s.charAt(j));
//                     j++;
//                 }
//                 i = j;
//                 ll.add(sb.toString());
//             }
//             else{
//                 i++;
//                 space++;
//             }
//         }
//         if( ll.size()==1 ){
//             StringBuilder sb = new StringBuilder(ll.get(0));
//             for(i =0 ; i<space ; i++) sb.append(" ");
//             return sb.toString();
//         } 

//         StringBuilder sb = new StringBuilder("");
//         int sp = space /  (ll.size()-1);
//         int extrasp = space % (ll.size()-1);

//         for(i = 0;i<ll.size();i++){
//             sb.append(ll.get(i));
//             if(i+1!=ll.size()) for(int j = 0;j < sp ; j++) sb.append(" ");
//         }

//         for(i =0 ; i<extrasp ; i++) sb.append(" ");

//         return sb.toString();
//     }
// }