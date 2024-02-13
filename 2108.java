// 2108. Find First Palindromic String in the Array

class Solution {
    public String firstPalindrome(String[] words) {
        for(String s : words){
            StringBuilder sb=new StringBuilder(s);
            if(sb.toString().equals(sb.reverse().toString())) return s;
        }
        return "";
    }
}