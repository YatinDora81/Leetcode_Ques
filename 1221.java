// 1221. Split a String in Balanced Strings

class Solution {
    public int balancedStringSplit(String s) {
        int ans=0;
        int cl = 0;
        int cr = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='L') cl++;
            else cr++;
            if(cl == cr){
                ans++;
                cl=0;
                cr=0;
            }
        }
        return ans;
    }
}