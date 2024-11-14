// // 1576. Replace All ?'s to Avoid Consecutive Repeating Characters

// class Solution {
//     public String modifyString(String s) {
//         StringBuilder sb = new StringBuilder("");
//         for( int i = 0; i<s.length() ; i++ ){
//             if( s.charAt(i)!='?' ){
//                 sb.append( s.charAt(i) );
//                 continue;
//             }
//             if( i==0 ){
//                 if( i+1 < s.length() && s.charAt(i+1)!='a' ) sb.append('a');
//                 else sb.append('b');
//             }
//             else if( i+1 == s.length() ){
//                 if( sb.charAt( sb.length()-1 )!='a' ) sb.append('a');
//                 else sb.append('b');
//             }
//             else{
//                 boolean isa = true;
//                 if( sb.charAt( sb.length()-1 )=='a' || s.charAt(i+1)=='a' ) isa = false;
//                 boolean isb = true;
//                 if( sb.charAt( sb.length()-1 )=='b' || s.charAt(i+1)=='b' ) isb = false;
                
//                 if( isa==false && isb==false ) sb.append("c");
//                 else if(isa==false) sb.append("b");
//                 else sb.append("a");
//             }
//         }

//         return sb.toString();
//     }
// }