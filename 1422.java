// // 1422. Maximum Score After Splitting a String

// class Solution {
//     public int maxScore(String s) {
//         int pref[] = new int[s.length()];
//         for(int i=0;i<pref.length;i++){
//             if(i!=0) pref[i] += pref[i-1];
//             pref[i] += s.charAt(i)-'0';
//         }

//         System.out.print(Arrays.toString(pref));
//         int ans = 0;
//         for(int i=0;i<pref.length-1;i++){
//             // System.out.println( i + " - " +( (i - pref[i]) + pref[pref.length-1] - pref[i]) );
//             ans = Math.max( ans , (i - pref[i]) + pref[pref.length-1] - pref[i] +1 );
//         }

//         return ans;
//     }
// }