// 509. Fibonacci Number

class Solution {
    public static int fib3(int n) {
        // fully optimized
        // tc-> 0(n)
        // sc-> 0(1)
        if(n<2) return n;
        
        int prev=1;
        int prev2=0;

        for(int i=2;i<=n;i++){
            int curi= prev + prev2;
            prev2=prev;
            prev=curi;
        }

        return prev;
        
    }

    public int fib(int n) {
        return fib3(n);
    }
}