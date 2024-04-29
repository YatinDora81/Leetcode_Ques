// 2103. Rings and Rods

class Solution {
    public int countPoints(String rings) {
        String arr[]=new String[10];
        for(int i=0;i<10;i++) arr[i] = "";
        for(int i=0;i<rings.length(); i+=2){
            if(!arr[Integer.parseInt(""+rings.charAt(i+1))].contains(""+rings.charAt(i))) arr[Integer.parseInt(""+rings.charAt(i+1))]+=rings.charAt(i);
        }
        int ans=0;
        for(String s :arr) if(s.contains("B") && s.contains("G") && s.contains("R") ) ans++;
        return ans;
    }
}