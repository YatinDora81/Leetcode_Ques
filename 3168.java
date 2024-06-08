// 3168. Minimum Number of Chairs in a Waiting Room

class Solution {
    public int minimumChairs(String s) {
        int e = 0;
        int ans =0;
        for(char ch : s.toCharArray()){
            if(ch=='E') e+=1;
            else e-=1;
            ans = Math.max(ans,e);
        }
        return ans;
    }
}