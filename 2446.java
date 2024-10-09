// // 2446. Determine if Two Events Have Conflict

// class Solution {
//     public boolean haveConflict(String[] e1, String[] e2) {
//         int s1 = give(e1[0]);
//         int e3 = give(e1[1]);

//         int s2 = give(e2[0]);
//         int e4 = give(e2[1]);

//         System.out.println( s1+ " " + e3 + " " + s2 + " " + e4 );

//         return (s2>=s1 && s2<=e3) || ( e4>=s1 && e4<=e3 ) || (s1>=s2 && s1<=e4) || ( e3>=s2 && e3<=e4 );
//     }

//     int give(String s){
//         String arr[] = s.split(":");
//         int a= Integer.parseInt(arr[0]) * 60;
//         int b= Integer.parseInt(arr[1]);
//         return a+b;
//     }
// }