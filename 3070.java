class Solution {
    public int countSubmatrices(int[][] grid, int k) {
        int n = grid.length , m = grid[0].length;
        int pref[][] = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int c = grid[i][j] + (j>0 ? pref[i][j-1] : 0);
                if(i>0) c+= pref[i-1][j];
                if(i>0 && j>0) c-= pref[i-1][j-1];
                pref[i][j] = c;
            }
        }

        // for(int i[] : pref) System.out.println(Arrays.toString(i));

        int ans = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(pref[i][j]<=k) ans++;
                else break;
            }
        }
        return ans;
    }
}