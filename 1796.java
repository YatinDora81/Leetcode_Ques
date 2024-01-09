// 1796. Second Largest Digit in a String

class Solution {
    public int secondHighest(String s) {
        int f=-1;
        int ss=-1;
       for(int i=0;i<s.length();i++){
           if(s.charAt(i)>='0' && s.charAt(i)<='9' ){
               int curr=s.charAt(i)-'0';
               if(f==-1){
                   f=s.charAt(i)-'0';
               }
               else{
                   if(s.charAt(i)-'0' > f){
                       ss=f;
                       f=s.charAt(i)-'0';
                   }
                   else if(s.charAt(i)-'0' > ss && s.charAt(i)-'0' < f ){
                       ss=s.charAt(i)-'0';
                   }
               }
           }
       } 
       return ss;
    }
}