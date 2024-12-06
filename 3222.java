// // 3222. Find the Winning Player in Coin Game

// class Solution {
//     public String winningPlayer(int x, int y) {
//         boolean f = false;

//         while( x>0 && y>3 ){
//             f = !f;
//             x-=1;
//             y-=4;
//         }

//         return f==false ? "Bob" : "Alice";
//     }
// }