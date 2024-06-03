// 2047. Number of Valid Words in a Sentence

class Solution {
    public int countValidWords(String s) {
        String arr[] = s.trim().split(" ");
        int ans = 0;

        for(int i=0;i<arr.length;i++){
            if(i==arr.length-1 && isvalid( arr[i] , true ) ){
                ans++;
            }
            else if( isvalid(arr[i].trim(), false) ) ans++;
        }

        return ans;
    }

    boolean isvalid(String s , boolean pun){
        if(s.equals("") || s.equals(" ")) return false;
        if( containnum(s)  ) return false;

        int hiff = 0;
        boolean p = false;

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if( ch=='-' ){
                if( i==0 || i==s.length()-1 ) return false;
                else if( !ischar( s.charAt(i-1) , s.charAt(i+1) ) ) return false;
                else if(hiff>0) return false;
                hiff++;
            }
            else if( (ch == '!' || ch == '.' || ch == ',' ) && !(i==s.length()-1) ) return false;
        }
        
        return true;
    }
    boolean ischar(char ch1,char ch2){
        return ch1>='a' && ch1<='z' && ch2>='a' && ch2<='z';
    }
    boolean containnum(String s){
        return s.contains("0") || s.contains("1") || s.contains("2") || s.contains("3") || s.contains("4") || s.contains("5") || s.contains("6") || s.contains("7") || s.contains("8") || s.contains("9");
    }

}