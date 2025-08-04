class Solution {
    public boolean isPalindrome(String t) {
        String s = t.toLowerCase().trim();
        int i = 0 , j = s.length()-1;
        while(i<=j){
            while( i<s.length() && !valid(s.charAt(i)) ) i++;
            while( j>=0 && !valid(s.charAt(j)) ) j--;
            if( i<j && s.charAt(i)!=s.charAt(j) ){
                // System.out.println( s.charAt(i) + "-" + s.charAt(j) + "-" + i + "-" + j );
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public boolean valid(char ch){
        return (ch>='a' && ch<='z') || (ch>='0' && ch<='9');
    }
}
