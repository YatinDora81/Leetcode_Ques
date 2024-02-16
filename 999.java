// 999. Available Captures for Rook

class Solution {
    public int numRookCaptures(char[][] board) {
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                if(board[i][j]=='R') return tell(board,i,j);
            }
        }
        return -1;
    }
    public int tell(char [][]mat,int r,int c){
        int i=r;
        int j=c;
        int ans=0;

        //left
        while(j>=0){
            if(mat[i][j]=='B') break;
            else if(mat[i][j]=='p'){
                ans+=1;
                break;
            }
            j--;
        }

        //right

        i=r;
        j=c;
        while(j<8){
            if(mat[i][j]=='B') break;
            else if(mat[i][j]=='p'){
                ans+=1;
                break;
            }
            j++;
        }

        //up

        i=r;
        j=c;
        while(i>=0){
            if(mat[i][j]=='B') break;
            else if(mat[i][j]=='p'){
                ans+=1;
                break;
            }
            i--;
        }

        //down
        i=r;
        j=c;
        
        while(i<8){
            if(mat[i][j]=='B') break;
            else if(mat[i][j]=='p'){
                ans+=1;
                break;
            }
            i++;
        }

        return ans;
    }
}