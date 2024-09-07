// // 415. Add Strings

// class Solution {
//     public String addStrings(String s1, String s2) {
        
//         StringBuilder sb = new StringBuilder("");
//         int carry = 0 ;
//         int i = s1.length()-1 , j = s2.length()-1 ;
//         while(i>=0 && j>=0){
//             int curr = s1.charAt(i) - '0' + s2.charAt(j) - '0' + carry;
//             carry = curr / 10;
//             curr = curr%10;
//             sb.insert( 0 , curr + "" );
//             i--;
//             j--;
//         }

//         while(i>=0){
//             int curr = s1.charAt(i) - '0' +  carry;
//             carry = curr / 10;
//             curr = curr%10;
//             sb.insert( 0 , curr + "" );
//             i--;
//         }
//         while(j>=0){
//             int curr = s2.charAt(j) - '0' +  carry;
//             carry = curr / 10;
//             curr = curr%10;
//             sb.insert( 0 , curr + "" );
//             j--;
//         }

//         if(carry!=0) sb.insert(0,  carry + "");


//         return sb.toString();
        
//     }
// }