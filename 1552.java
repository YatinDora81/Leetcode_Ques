// // 1552. Magnetic Force Between Two Balls

// class Solution {
//     public int maxDistance(int[] arr, int m) {
//         Arrays.sort(arr);
//         int s = 0;
//         int e = arr[arr.length-1];
//         int ans = -1;
//         while(s<=e){
//             int mid = s + (e-s)/2;
//             if(isposs(arr,mid,m)){
//                 ans = mid;
//                 s = mid +1;
//             }
//             else e=mid-1;
//         }
//         return ans;
//     }

//     boolean isposs(int []arr , int gap , int m){
//         int curr = 1;
//         int prev = arr[0];

//         for(int i=1;i<arr.length;i++){
//             if(curr==m) return true;
//             if( arr[i] - prev >=gap ){
//                 curr++;
//                 prev = arr[i];
//                 if(curr>=m) return true;
//             }
//         }
//         return curr>=m;
//     }
// }