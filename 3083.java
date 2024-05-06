// // 3083. Existence of a Substring in a String and Its Reverse

// class Solution {
//     public boolean isSubstringPresent(String s) {
//         StringBuilder sb=new StringBuilder();
//         int i=0,j=0;
//         while(j<s.length()){
            
//            sb.append( s.charAt(j) );
 
//             if(j-i+1<2) j++;

//             else if(j-i+1==2){
//                 System.out.print(sb + " ");
//                 if( has( s,sb.toString() ) ) return true;
//                 sb.deleteCharAt(0);
//                 j++;
//                 i++;
//             }

//         }

//         return false;
//     }
//     boolean has(String s ,String t){
//         StringBuilder sb=new StringBuilder(t);
//         return s.contains(sb.reverse().toString());
//     }
// }