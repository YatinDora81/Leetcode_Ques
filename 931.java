// 931. Minimum Falling Path Sum

/*
public int minFallingPathSum(int[][] arr) {
    //tabulation
    int mini=Integer.MAX_VALUE;
    int n=arr.length;
    int dp[][]=new int[n][n];
    for(int i=0;i<n;i++){
        dp[0][i]=arr[0][i];
    }

    for(int i=1;i<n;i++){
        for(int j=0;j<n;j++){
            int l=Integer.MAX_VALUE;
            int m=Integer.MAX_VALUE;
            int r=Integer.MAX_VALUE;
            m=dp[i-1][j];
            if(j>0) l=dp[i-1][j-1];
            if(j+1<n) r=dp[i-1][j+1];
            dp[i][j]=arr[i][j] + Math.min(l,Math.min(r,m));
        }
    }
    int ans=Integer.MAX_VALUE;
    for(int i=0;i<n;i++){
        ans=Math.min(ans,dp[n-1][i]);
    }

    return ans;

}


//memoization
class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int mini=Integer.MAX_VALUE;
        int dp[][]=new int[matrix.length][matrix.length];
        for(int i =0 ; i<matrix.length;i++){
            Arrays.fill(dp[i],-1);
        }
        for(int i=0;i<matrix.length;i++){
            mini=Math.min(mini,tell(0,i,matrix,dp));
        }
        return mini;
    }
    public int tell(int i,int j,int [][]arr,int dp[][]){
        if(j>=arr.length || j<0) return Integer.MAX_VALUE;
        if(i==arr.length-1) return arr[i][j];
        if(dp[i][j]!=-1) return dp[i][j];

        int l=tell(i+1,j,arr,dp);
        int r=tell(i+1,j-1,arr,dp);
        int h=tell(i+1,j+1,arr,dp);

        return dp[i][j]= arr[i][j] + Math.min(l,Math.min(r,h));
    }
}

*/