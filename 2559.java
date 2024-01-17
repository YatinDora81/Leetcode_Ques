// 2559. Count Vowel Strings in Ranges

class Solution {
    public int[] vowelStrings(String[] words, int[][] arr) {
        int ans[]=new int[arr.length];
        int pref[]=new int[words.length];
        for(int i=0;i<words.length;i++){
            String s=words[i];
            if(i==0) pref[0]= (is(s.charAt(0)) && is(s.charAt(s.length()-1))) ? 1 : 0;
            else pref[i]= (is(s.charAt(0)) && is(s.charAt(s.length()-1))) ? pref[i-1]+1 : pref[i-1];
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i][0]==0) ans[i]=pref[arr[i][1]];
            else ans[i]=pref[arr[i][1]] - pref[arr[i][0] - 1];
        }
        return ans;
    }
    public boolean is(char ch){
        return ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O'||ch=='U';
    }
}