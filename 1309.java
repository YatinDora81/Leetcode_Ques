// 1309. Decrypt String from Alphabet to Integer Mapping

class Solution {
    public String freqAlphabets(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if( i+2<s.length() && s.charAt(i+2)=='#' ){
                char ch = (char)( 'a' -1 + Integer.parseInt(s.charAt(i)+""+s.charAt(i+1)));
                sb.append( ch );
                i+=2;
            }
            else{
                char ch = (char)( 'a' -1 + Integer.parseInt(s.charAt(i)+""));
                sb.append( ch );
            }
        }
        return sb.toString();
    }
}