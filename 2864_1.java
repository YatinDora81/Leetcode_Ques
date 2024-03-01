// 2864. Maximum Odd Binary Number

class Solution {
    public String maximumOddBinaryNumber(String s) {
        int c= 0;
        for(char ch : s.toCharArray()) if(ch=='1') c++;
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<s.length();i++) sb.append("0");
        if(c==0) return sb.toString();
        if(c==1) sb.setCharAt(  sb.length()-1 , '1' );
        else{
            sb.setCharAt(  sb.length()-1 , '1' );
            c--;
            int ind = 0;
            while(c--!=0) sb.setCharAt(  ind++ , '1' );
        }
        return sb.toString();
    }
}