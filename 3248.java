// // 3248. Snake in Matrix

// class Solution {
//     public int finalPositionOfSnake(int n, List<String> commands) {
//         int i = 0 , j = 0;
//         for(String s : commands){
//             if(s.equals("UP")) i-=1;
//             else if(s.equals("RIGHT")) j += 1;
//             else if(s.equals("LEFT")) j-=1;
//             else i+=1;
//         }
//         // System.out.println( i + " - " + j + " - - " + " row is " + n*i +" col is " + j );
//         return (n*i)+j;
//     }
// }