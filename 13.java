// // 13. Roman to Integer

// class Solution {
//     public int romanToInt(String s) {
//         HashMap<Character,Integer> map = new HashMap<>();
//         map.put( 'I' , 1 );
//         map.put( 'V' , 5 );
//         map.put( 'X' , 10 );
//         map.put( 'L' , 50 );
//         map.put( 'C' , 100 );
//         map.put( 'D' , 500 );
//         map.put( 'M' , 1000 );

//         int curr = 1;
//         int ans = 0;
//         for( int i=s.length()-1; i>=0;i-- ){
//             char ch = s.charAt(i);
//             if( map.get(ch)>=curr ){
//                 ans += map.get(ch);
//                 curr = map.get(ch);
//             }
//             else{
//                 ans -= map.get(ch);
//             }
//         }

//         return ans;
//     }
// }