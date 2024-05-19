// // 3136. Valid Word

// class Solution {
//     public boolean isValid(String s) {
//         boolean a=false;
//         boolean b=false;
        
//         if(s.length()<3) return false;

//         for(char ch : s.toCharArray()){
//             if( !(ch>='a' && ch<='z') && !(ch>='A' && ch<='Z') && !(ch>='0' && ch<='9') ) return false;
//             else if( isvowel(ch) ) a=true;
//             else if( !isvowel(ch) && ( (ch>='a' && ch<='z' ) || ( ch>='A' && ch<='Z' ) )  && !(ch>='0' && ch<='9') ) b=true;
            
//         }
//         return a && b;
//     }
//     public  boolean isvowel(char ch) {
//         ch = Character.toLowerCase(ch);
//         return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
//     }
// }