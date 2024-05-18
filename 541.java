// 541. Reverse String II

class Solution {
    public String reverseStr(String s, int k) {
        StringBuilder sb =new StringBuilder();
        boolean f = true;
        for(int i=0;i<s.length();i+=k){
            StringBuilder temp=new StringBuilder();
            for(int j=0;j<k && i+j<s.length();j++) temp.append( s.charAt(i+j) );
            System.out.println(temp.toString());
            if(f) sb.append(temp.reverse().toString());
            else sb.append(temp.toString());
            f=!f;
        }
        return sb.toString();
    }
}