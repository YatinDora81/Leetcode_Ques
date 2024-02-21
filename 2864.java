// 2864. Maximum Odd Binary Number

class Solution {
    public String maximumOddBinaryNumber(String s) {
        StringBuilder sb=new StringBuilder("");
        int c=0;
        for(char ch : s.toCharArray()){
            sb.append("0");
            if(ch=='1') c++;
        }
        int j=0;
        while(c!=0){
            if( sb.charAt(sb.length()-1) != '1' ){
                sb.setCharAt( sb.length()-1 , '1');
                c--;
            }
            else{
                sb.setCharAt(j,'1');
                j++;
                c--;
            }
        }
        return sb.toString();
    }
}