// // 826. Most Profit Assigning Work

// class Solution {
//     public class pair{
//         int d;
//         int p;
//         pair(int d,int p){
//             this.d = d;
//             this.p = p;
//         }
//     }
//     public int maxProfitAssignment(int[] difficulty, int[] profit, int[] w) {
//         pair arr[] = new pair[profit.length];
//         for(int i=0;i<profit.length;i++){
//             arr[i] = new pair( difficulty[i] , profit[i] );
//         }

//         Arrays.sort(arr , (a,b)->{
//             if(a.d-b.d<0) return -1;
//             else if(a.d-b.d>0) return 1;
//             return 0;
//         });

//         int pref[] = new int[profit.length];
//         int maxi = 0;
//         for(int i=0;i<arr.length;i++){
//             pref[i] = Math.max( maxi , arr[i].p );
//             maxi = pref[i];
//         };

//         // for(pair p : arr) System.out.print( p.d + " " + p.p  + " , ");
//         //ciel of bs
//         int ans =0;
//         for(int i=0;i<w.length;i++){
//             int key = w[i];

//             int ind = bs(arr, key);
//             // System.out.print( ind + " " );
//             if(ind<0) ans += 0;
//             else ans += pref[ind];
            
//         }

//         return ans;
//     }

//     int bs(pair []arr , int key){
//         int s = 0;
//         int e = arr.length-1;
//         int ans = -1;
//         while(s<=e){
//             int mid = s + (e-s)/2;
//             if(arr[mid].d<=key){
//                 ans = mid;
//                 s = mid+1;
//             }else{
//                 e = mid-1;
//             }
//         }
//         return ans;
//     }
// }