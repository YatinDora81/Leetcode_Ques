// class Solution {
//     public int minCost(int n) {
//         // int ans = 0;
//         // int arr1[] = solve(n);
//         // int arr2[] = solve(arr1[1]);
//         // int arr3[] = solve(arr1[2]);
        
//         // ans += (arr1[0] + arr2[0] + arr3[0]);
//         // while(true){
//         //     arr2 = solve(arr2[1]);
            
//         // }
//         // return ans;
//         int r = n;
//         return r * (r-1)/2;
//     }
//     public int[] solve(int n){
//         if(n<=1) return new int[]{n,0,0};
//         int cost = Integer.MAX_VALUE;
//         int arr[] = new int[3];
//         arr[0] = cost;
//         for(int i = 1;i<n;i++){
//             for(int j = 1;j<n;j++){
//                 if(i+j!=n) continue;
//                 cost = Math.min(i*j,cost);
//                 if(i*j<cost){
//                     cost = i*j;
//                     arr[0] = i*j;
//                     arr[1] = i;
//                     arr[2] = j;
//                 }
//                 // cost += (i*j);
                
//             }
//         }
//         return arr;
//     }
// }