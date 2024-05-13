// 861. Score After Flipping Matrix

class Solution {
    public int matrixScore(int[][] arr) {
        int n= arr.length;
        int m=arr[0].length;

        for(int i=0;i<n;i++){
            if(arr[i][0]==0) revrow(arr,i);
        }

        for(int i=0;i<m;i++){
            int z=0,o=0;
            for(int j=0;j<n;j++){
                if(arr[j][i]==1) o++;
                else z++;
            }
            if(z>o) revcol(arr,i);
        }

        int ans=0;
        for(int i[] : arr){
            StringBuilder sb=new StringBuilder();
            for(int j : i) sb.append(j+"");
            ans += Integer.parseInt( sb.toString() , 2 );
       }


        return ans;

    }
    void revcol(int [][]arr,int col){
        for(int i=0;i<arr.length;i++){
            if(arr[i][col]==0) arr[i][col]=1;
            else arr[i][col]=0;
        }
    }

    void revrow(int [][]arr,int row){
        for(int i=0;i<arr[0].length;i++){
            if(arr[row][i]==0) arr[row][i]=1;
            else arr[row][i]=0;
        }
    }
}