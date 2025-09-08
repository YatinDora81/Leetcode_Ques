// class Solution {
//     public int myAtoi(String s) {
//         if(s.trim().length()==0) return 0;
//         boolean isPlus = s.trim().charAt(0)!='-' ? true : false;
//         s = s.trim();
//         long c = ans( (s.charAt(0)=='+' ||s.charAt(0)=='-' ) ? 1 : 0 , s , "" , true );
//         if(!isPlus) c = -c;
//         if (c > Integer.MAX_VALUE) return Integer.MAX_VALUE;
//         if (c < Integer.MIN_VALUE) return Integer.MIN_VALUE;
//         return  (int)(c);
//     }
//     public long ans(int ind , String s , String t , boolean zero){
//         if(ind>=s.length() || is(s.charAt(ind)) || (t.length()!=0 && Long.parseLong(t)>Integer.MAX_VALUE ) ) return t.length()!=0 ? Long.parseLong(t) : 0;
//         if(zero) zero = s.charAt(ind)!='0' ? false : true;
//         long c = ans(ind +1 , s , t + (zero ? "" : (s.charAt(ind) + "") ) , zero );
//         return c;
//     }

//     public boolean is(char ch){
//         return !(ch>='0' && ch<='9');
//     }
// }