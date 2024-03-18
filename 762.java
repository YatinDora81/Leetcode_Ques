// 762. Prime Number of Set Bits in Binary Representation

class Solution {
    public int countPrimeSetBits(int left, int right) {
        int ans= 0;
        for(int i=left;i<=right;i++){
            if(isprime(Integer.bitCount(i))) ans++;
        }
        return ans;

    }

    boolean isprime(int n){
        if(n<2) return false;
        if(n==2 || n==3) return true;
        for(int i=2;i<=n/2;i++){
            if(n%i==0) return false;
        }
        return true;
    }
}