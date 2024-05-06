// // 1805. Number of Different Integers in a String

// class Solution {
//     String del(String s){
//         StringBuilder sb=new StringBuilder();
//         boolean f=true;
//         for(int i=0;i<s.length();i++){
//             if( s.charAt(i)!='0' || !f ){
//                 f=false;
//                 sb.append(s.charAt(i));
//             }
//         }
//         return sb.toString();
//     }
//     public int numDifferentIntegers(String s) {
//         HashSet<String> set=new HashSet<>();
//         for( int i=0;i<s.length();i++ ){
//             int j=i;
//             boolean f= false;
//             while( j<s.length() && s.charAt(j)>='0' && s.charAt(j)<='9' ){
//                 j++;
//                 f=true;
//             }
//             if(f){
//                 set.add( del(s.substring(i,j) ) );
//                 i=j-1;
//             }
//         }
//         // System.out.print(set);
//         return set.size();
//     }
// }