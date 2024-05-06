// // 3120. Count the Number of Special Characters I

// class Solution {
//     public int numberOfSpecialChars(String s) {
//         HashMap<String,Integer> map=new HashMap<>();
//         int ans=0;
//         for(char ch : s.toCharArray()){
//             String str = ""+ch;
//             if(map.containsKey( str.toLowerCase() )){
//                 if(map.get( str.toLowerCase() )==1 && ch>='A' && ch<='Z' ){
//                     map.put(  str.toLowerCase()  , 3 );
//                     ans++;
//                 }
//                 else if(map.get( str.toLowerCase() )==2 && ch>='a' && ch<='z' ){
//                     map.put(  str.toLowerCase()  , 3 );
//                     ans++;
//                 }
//             }
//             else{
//                 if( ch>='a' && ch<='z' ) map.put( str.toLowerCase() , 1 );
//                 else if(ch>='A' && ch<='Z') map.put(str.toLowerCase() , 2 );
//             }
//         }
//             return ans;
//     }
// }