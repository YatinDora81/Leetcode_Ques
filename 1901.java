// // 1901. Find a Peak Element II

// class Solution {
//     public int[] findPeakGrid(int[][] mat) {
//         //find col with bs and then get max of paricular col then check its left and right
//         if(mat.length==1){
//             int c=0;
//             int maxi = mat[0][0];
//             for(int i=0;i<mat[0].length;i++){
//                 if(maxi<mat[0][i]){
//                     maxi = mat[0][i];
//                     c=i;
//                 }
//             }
//             int ans[] = new int[2];
//             ans[1]= c;
//             return ans;
//         }
//         if(mat[0].length==1){
//             int r =0;
//             int maxi =mat[0][0];
//             for(int i=0;i<mat.length;i++){
//                 if(maxi<mat[i][0]){
//                     r= i;
//                     maxi = mat[i][0];
//                 }
//             }
//             int ans[] = new int[2];
//             ans[0] = r;
//             return ans;
//         }
//         int s= 0 ;
//         int e= mat[0].length-1;
//         while(s<=e){
//             int mid = s + (e-s)/2;
//             int maxi = -1;
//             int maxr=-1;
//             for(int i=0;i<mat.length;i++){
//                 if(mat[i][mid]>maxi){
//                     maxi = mat[i][mid];
//                     maxr = i;
//                 }
//             }
//             int l=-1;
//             int r=-1;
//             if(mid==0){
//                 l=-1;
//                 r = mat[maxr][mid+1];
//             }
//             else if(mid==mat[0].length-1){
//                 r=-1;
//                 l = mat[maxr][mid-1];
//             }
//             else{
//                 r = mat[maxr][mid+1];
//                 l = mat[maxr][mid-1];
//             }

//             if( maxi > l && maxi>r ){
//                 int ans[] = new int[2];
//                 ans[0] = maxr;
//                 ans[1] = mid;
//                 return ans;
//             }
//             else if( maxi<l ){
//                 e = mid-1;
//             }
//             else s = mid+1;
//         }
//         int ans[] =new int[2];
//         Arrays.fill(ans,-1);
//         return ans;
        
//     }
// }