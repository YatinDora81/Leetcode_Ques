// 2042. Check if Numbers Are Ascending in a Sentence

class Solution {
    public boolean areNumbersAscending(String s) {
        long a= -1;
        for( int i=0;i<s.length();i++ ){
            int j=i;
            boolean f= false;
            while( j<s.length() && s.charAt(j)>='0' && s.charAt(j)<='9' ){
                j++;
                f=true;
            }
            if(f){
                long ll= Long.parseLong(s.substring(i,j));
                if(ll>a) a=ll;
                else return false;
                i=j-1;
            }
        }
        return true;
    }
}