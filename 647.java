// // 647. Palindromic Substrings


class Solution {
    public int countSubstrings(String s) {
        int c=0;
        for(int i=0;i<s.length();i++) for(int j=i;j<s.length();j++) if(ispali(s.substring(i,j+1))) c++;
        return c;
    }
    public boolean ispali(String s){
        StringBuilder sb=new StringBuilder(s);
        return s.equals(sb.reverse().toString());
    }
}