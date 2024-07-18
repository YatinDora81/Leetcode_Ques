// // 2177. Find Three Consecutive Integers That Sum to a Given Number

// class Solution {
//     public long[] sumOfThree(long num) {
//         if( (num/3)-1 + (num/3) + (num/3)+1 == num ){
//             long arr[] = new long[3];
//             arr[0] = (num/3)-1; arr[1]= (num/3) ; arr[2] = (num/3)+1;
//             return arr;
//         }
//         long ans[] = new long[0];
//         return ans;
//     }
// }


// class Solution {
//     public long[] sumOfThree(long num) {
//         long s= -1;
//         long e = num/2;
        
//         while(s<=e){
//             long mid = s + (e-s)/2;
//             if(3*mid+3 == num){
//                 long[] arr = new long[3];
//                 arr[0] = mid ; arr[1] = mid +1 ; arr[2] = mid+2;
//                 return arr;
//             }
//             else if(3*mid+3 < num ){
//                 s = mid+1;
//             }
//             else e = mid -1;
//         }
//         long[] arr = new long[0];
//         return arr;
//     }
// }