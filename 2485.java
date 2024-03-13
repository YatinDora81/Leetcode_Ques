// 2485. Find the Pivot Integer

class Solution {
    public int pivotInteger(int n) {
        for(int i=1;i<=n;i++) if(isposs(i,n)) return i;
        return -1;
    }

    boolean isposs(int i,int n){
        int s= i*(i+1)/2;
        int e = (n*(n+1)/2 ) - ( (i-1)*(i-1+1)/2 );
        return e==s;
    }
}