// class Solution {
//     public int distanceBetweenBusStops(int[] arr, int s, int d) {
//         int sum = 0;
//         if(s>d){
//             int t = s;
//             s = d;
//             d = t;
//         }
//         for(int i=s;i<d;i++) sum+=arr[i];
//         int ans = sum;

//         sum =0 ;
//         for(int i=d;i<arr.length;i++) sum+=arr[i];
//         for(int i=0;i<s;i++) sum+=arr[i];

//         return Math.min(sum,ans);
//     }
// }