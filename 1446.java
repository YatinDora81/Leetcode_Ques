// 1446. Consecutive Characters

class Solution {
    public int maxPower(String s) {
        int maxi=0;
        for(int i=0;i<s.length();i++){
            int j=i+1;
            char ch = s.charAt(i);
            int c=1;
            boolean f= false;
            while(j<s.length() && s.charAt(j)==ch){
                j++;
                c++;
                f=true;
            }
            maxi=Math.max(maxi,c);
            if(!f) i=j-1;
        }
        return maxi;
    }
}