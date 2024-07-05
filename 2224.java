// // 2224. Minimum Number of Operations to Convert Time

// class Solution {
//     public int convertTime(String current, String correct) {
//         if(current.equals(correct)) return 0;
//         String s1[] = current.split(":");
//         String s2[] = correct.split(":");

//         int ans = 0;
        

//         int a = Integer.parseInt(s1[1]);
//         int bb = Integer.parseInt(s2[1]);
//         int b = bb-a;
//         if(bb>a){
//             ans += Integer.parseInt(s2[0]) - Integer.parseInt(s1[0]);
//             while( b>=15 ){
//                 b-=15;
//                 ans++;
//             }
//             while( b>=5 ){
//                 b-=5;
//                 ans++;
//             }
//             while( b>=1 ){
//                 b-=1;
//                 ans++;
//             }
//         }
//         else if(bb<a){
//             int c=60 - a + bb;
//             int h1 = Integer.parseInt(s1[0]);
//             int h2 = Integer.parseInt(s2[0]);
//             // System.out.print(ans);
//             // ans = h2 - h1 + 1;
//             while(h2!=h1+1){
//                 h1++;
//                 ans++;   
//             }
//             // System.out.print(ans + " " + h2 + " " + h1);

//             while(c>=15){
//                 c-=15;
//                 ans++;
//             }
//             while(c>=5){
//                 c-=5;
//                 ans++;
//             }
//             while(c>0){
//                 c-=1;
//                 ans++;
//             }
//         }
//         else{
//             ans += Integer.parseInt(s2[0]) - Integer.parseInt(s1[0]);
//         }
//         return ans;
//     }
// }