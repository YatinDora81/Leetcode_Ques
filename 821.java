// // 821. Shortest Distance to a Character

// class Solution {
//     public int[] shortestToChar(String s, char c) {
//         int ans[] = new int[s.length()];
//         Arrays.fill(ans,-1);
//         for(int i=0;i<s.length();i++){
//             if(s.charAt(i)==c) ans[i]=0;
//         }

//         for(int i=0;i<ans.length;i++){
//             if(ans[i]==-1){
//                 int cc = tell( ans , i );
//                 ans[i] = cc;
//             }
//         }

//         return ans;
        
//     }

//     int tell(int arr[] , int curr){
//         int n = Math.max( curr , arr.length-curr );
//         int c = 0 ;
//         for(int i=0;i<n;i++){
//             if( curr-i>=0 && arr[curr-i]==0) return c;
//             else if( curr+i<arr.length && arr[curr+i]==0  ) return c;
//             c++;
//         }
//         return c;
//     }
// }