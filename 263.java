// // 263. Ugly Number

// class Solution {
//     public boolean isUgly(int n) {
//         return tell(n);
//     }

//     boolean tell(int n){
//         if(n<=0) return false;
//         if(n==1) return true;
//         boolean a = false, b = false , c = false;
//         if(n%2==0){
//             a = tell(n/2);
//         }
//         if(a==false && n%3==0){
//             b = tell(n/3);
//         }
//         if( a==false && b==false && n%5==0 ){
//             c = tell(n/5);
//         }

//         boolean ans = a || b || c;

//         return ans;
//     }
// }


// /*

//  public boolean isUgly(int n) {
//         if(n<=0) return false;
//         while(n%2==0) n/=2;
//         while(n%3==0) n/=3;
//         while(n%5==0) n/=5;
//         return (n==1) ? true : false;
//     }

// */