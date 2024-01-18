// 2341. Maximum Number of Pairs in Array

/*
class Solution {
    public int[] numberOfPairs(int[] nums) {
        int ans[]={0,0};
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i : nums){
            if(map.containsKey(i)) map.put(i,map.get(i)+1);
            else map.put(i,1);
        }
        for(int i : map.values()){
            if(i%2!=0) ans[1]+=1;
            ans[0]+=i/2;
        }
        return ans;
    }
}
*/