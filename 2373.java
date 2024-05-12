// 2373. Largest Local Values in a Matrix

class Solution {
    public int[][] largestLocal(int[][] grid) {
        int arr[][] = new int[grid.length-2][grid.length-2];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                int maxi=1;

                for(int ni=i;ni<i+3;ni++){
                    for(int nj=j;nj<j+3;nj++){
                        maxi=Math.max(maxi,grid[ni][nj]);
                    }
                }

                arr[i][j]=maxi;
            }
        }
        return arr;
    }
}