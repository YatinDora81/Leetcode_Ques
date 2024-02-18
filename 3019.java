// 3019. Number of Changing Keys


class Solution {
    public int countKeyChanges(String s) {
        int ans=0,n=s.length()-1;
        for(int i=0;i<n;i++) if(!(s.charAt(i)+"").toLowerCase().equals((s.charAt(i+1)+"").toLowerCase())) ans++;
        return ans;
    }
}