// 36. Valid Sudoku

class Solution {
    public boolean isValidSudoku(char[][] arr) {
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]!='.' &&!is(arr,i,j,arr[i][j])) return false;
            }
        }
        return true;
    }
    boolean is(char[][] arr,int r,int c,char ch){
        
        for(int i=0;i<9;i++){
            if( arr[r][i]==ch && i!=c ) return false;
            if( arr[i][c]==ch && i!=r ) return false;
            if( arr[3*(r/3)+i/3][3*(c/3)+i%3]==ch && (3*(r/3)+i/3)!=r && (3*(c/3)+i%3)!=c ) return false;
        }
        return true;
    }
}