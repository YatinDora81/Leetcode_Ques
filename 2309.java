// // 2309. Greatest English Letter in Upper and Lower Case


// class Solution {
//     public String greatestLetter(String s) {
//         HashSet<Character> set=new HashSet<>();
//         for(char ch : s.toCharArray()){
//             set.add(ch);
//         }
//         char ans = ' ';
//         for(char ch : set ){
//             if( ch>='a' && ch<='z' && set.contains( (char)(ch-32) ) ) ans= (char)(Math.max( (int)ans  ,(ch-32) ));
//             else if( ch>='A' && ch<='Z' && set.contains( (char)(ch+32) ) ) ans= (char)(Math.max( (int)ans  ,(ch) ));
//         }
//         if(ans==' ') return "";
//         return ans+"";
        
//     }
// }