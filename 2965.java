// 2965. Find Missing and Repeated Values
/* 
class Solution {
    public int[] findMissingAndRepeatedValues(int[][] gird) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int ans[]={0,0};
        for(int i=1;i<=gird.length*gird.length;i++) map.put(i,1);
        for(int i=0;i<gird.length;i++) for(int j=0;j<gird.length;j++) map.put(gird[i][j] , map.get(gird[i][j]) -1 );
        for(int i : map.keySet()){
            if(map.get(i)<0) ans[0]=i;
            else if(map.get(i)==1) ans[1]=i;
        }
        return ans;
    }
}
*/