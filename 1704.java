// 1704. Determine if String Halves Are Alike

class Solution {
    public boolean halvesAreAlike(String s) {
        int c1=0;
        int c2=0;
        int n=s.length()/2;
        for(int i=0;i<n;i++){
            if(is(s.charAt(i))) c1++;
            if(is(s.charAt((s.length()/2)+i))) c2++;
        }
        return c1==c2;
    }

    public boolean is(char ch){
        return (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U');
    }
}