// // 1963. Minimum Number of Swaps to Make the String Balanced


// class Solution {
//     public int minSwaps(String s) {
//         int ans = 0;
//         int o = 0;
//         int c = 0;
//         for(int i=0;i<s.length();i++){
//             if(s.charAt(i)=='[') o++;
//             else if( s.charAt(i)==']' && o>0 ) o--;
//             else c++;
//         }

//         ans += o/2;
//         if(o%2!=0) ans++;

//         return ans;
//     }
// }