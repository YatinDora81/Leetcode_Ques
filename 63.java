// 63. Unique Paths II

class Solution {
    int mod = (int)1e9*2;
    public int uniquePathsWithObstacles(int[][] arr) {
        int n=arr.length;
        int m=arr[0].length;
        int prev[]=new int[m];

        if(arr[0][0]==1 || arr[n-1][m-1]==1) return 0;
        
        for(int i=0;i<n;i++){
            int curr[]=new int[m];
            for(int j=0;j<m;j++){
                if(arr[i][j]==1) continue;
                else if(i==0 && j==0 && arr[i][j]==0) curr[0]=1;
                else{
                    int up=0,left=0;
                    if(i-1>=0 ) up += prev[j];
                    if(j-1>=0 ) left += curr[j-1];
                    curr[j]=(up+left)%mod;
                }
            }
            prev=curr;
        }

        return prev[m-1];
    }
}