// 1657. Determine if Two Strings Are Close

class Solution {
    public boolean closeStrings(String s1, String s2) {
        int []freq1=new int[26];
        int []freq2=new int[26];

        if(s1.length() != s2.length() ) return false;

        for(int i=0 ; i<s1.length() ; i++){
            freq1[s1.charAt(i) - 'a']+=1;
            freq2[s2.charAt(i) - 'a']+=1;
        }
        for(int i=0;i<26;i++){
            if( (freq1[i]==0 && freq2[i]!=0) || (freq1[i]!=0 && freq2[i]==0) ) return false;
        }
        Arrays.sort(freq1);
        Arrays.sort(freq2);
        return Arrays.equals(freq1,freq2);
    }
}