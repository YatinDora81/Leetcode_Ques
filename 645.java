// 645. Set Mismatch
class Solution {
    public int[] findErrorNums(int[] nums) {
        int ans[]={-1,-1};
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=1;i<=nums.length;i++) map.put(i,0);
        for(int i : nums) map.put(i,map.get(i)+1);
        for(int i : map.keySet()){
            if(map.get(i)>1) ans[0]=i;
            if(map.get(i)==0) ans[1]=i;
        }
        return ans;
    }
}