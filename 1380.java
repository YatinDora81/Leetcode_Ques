// https://leetcode.com/problems/lucky-numbers-in-a-matrix/
// 1380
class Solution {
    public List<Integer> luckyNumbers (int[][] arr) {
        List<Integer> ans=new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(ishappy(arr,i,j)){
                    ans.add(arr[i][j]);
                }
            }
        }

        return ans;
    }

    public boolean ishappy(int [][]arr,int row,int col){

        int n=arr.length;
        int m=arr[0].length;

        //checking row
        for(int i=0;i<n;i++){
            if(i==row) continue;
            if(arr[row][col] < arr[i][col]) return false;
        }
        //checking col
        for(int i=0;i<m;i++){
            if(i==col) continue;
            if(arr[row][col] > arr[row][i]) return false;
        }

        return true;
    }
}