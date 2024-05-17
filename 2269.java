// // 2269. Find the K-Beauty of a Number

// class Solution {
//     public int divisorSubstrings(int num, int k) {
//         k++;
//         String s=""+num;
//         int i=0,j=0;
//         int ans=0;
//         while(j<s.length()){
//             j++;
//             if( j-i+1<k ) continue;
//             else if( j-i+1==k ){
//                 if( is(s.substring(i,j))  && num%Integer.parseInt(s.substring(i,j))==0 ) ans++;
//                 i++;
//             }
//         }

//         return ans;
//     }
//     boolean is(String s){
//         return s.contains("1") || s.contains("2") || s.contains("3") || s.contains("4") || s.contains("5") || s.contains("6") || s.contains("7") || s.contains("8") || s.contains("9"); 
//     }
// }