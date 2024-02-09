// 202. Happy Number

class Solution {
    public boolean isHappy(int n) {
        while(n>=10){
            int sum=0;
            int n1=n;
            while(n1!=0){
                int rem= n1%10;
                sum = sum + rem*rem;
                n1=n1/10;
            }
            n=sum;
        }
        if(n==1 || n==7 ) return true;
        return false;
    }
}