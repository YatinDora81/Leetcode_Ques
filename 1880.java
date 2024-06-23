// 1880. Check if Word Equals Summation of Two Words

class Solution {
    public boolean isSumEqual(String s1, String s2, String s3) {
        StringBuilder sb1= new StringBuilder();
        StringBuilder sb2= new StringBuilder();
        StringBuilder sb3= new StringBuilder();
        for(char ch : s1.toCharArray()) sb1.append( ch-'a' );
        for(char ch : s2.toCharArray()) sb2.append( ch-'a' );
        for(char ch : s3.toCharArray()) sb3.append( ch-'a' );
        long c=0;
        c += Long.parseLong(sb1.toString());
        c += Long.parseLong(sb2.toString());
        return c == Long.parseLong(sb3.toString());
    }
}