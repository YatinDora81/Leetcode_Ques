// 1252. Cells with Odd Values in a Matrix

class Solution {
    public int oddCells(int n, int m, int[][] indices) {
        int arr[][]=new int[n][m];
        for(int ind[] : indices){
            int x=ind[0];
            int y=ind[1];
            for(int i=0;i<m;i++) arr[x][i] += 1;
            for(int i=0;i<n;i++) arr[i][y] += 1;
        }
        int ans = 0;
        for(int i=0;i<n;i++) for(int j=0;j<m;j++) if(arr[i][j]%2!=0) ans++;
        return ans;
    }
}