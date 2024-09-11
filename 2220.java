// // 2220. Minimum Bit Flips to Convert Number

// class Solution {
//     public int minBitFlips(int a, int b) {
//         StringBuilder sb1= new StringBuilder(Integer.toBinaryString(a));
//         StringBuilder sb2= new StringBuilder(Integer.toBinaryString(b));
//         int len = Math.max(sb1.length() , sb2.length());
        
//         make(len, sb1,sb2);
        
//         int ans =0;
//         for(int i=0;i<sb1.length();i++){
//             if(sb1.charAt(i)!=sb2.charAt(i)) ans++;
//         }
//         return ans;
//     }
//     void make(int l ,StringBuilder sb1, StringBuilder sb2){
//         int n = l - sb1.length();
//         for(int i=0;i<n;i++) sb1.insert(0,"0");
//         n = l - sb2.length();
//         for(int i=0;i<n;i++) sb2.insert(0,"0");
        
//     }
// }