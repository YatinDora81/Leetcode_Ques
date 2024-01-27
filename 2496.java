// 2496. Maximum Value of a String in an Array
class Solution {
    public int maximumValue(String[] arr) {
        int maxi=0;
        for(int i=0;i<arr.length;i++) maxi=Math.max(maxi,tell(arr[i]));
        return maxi;
    }
    public int tell(String s){
        for(int i=0;i<s.length();i++) if(s.charAt(i)>='a' && s.charAt(i)<='z') return s.length();
        return Integer.parseInt(s);
    }
}