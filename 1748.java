// 1748. Sum of Unique Elements

/* 
class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i : nums){
            if(map.containsKey(i)) map.put(i , map.get(i)+1);
            else map.put(i,1);
        }
        int ans=0;
        for(int i : map.keySet()) if(map.get(i)==1) ans+=i;
        return ans;
    }
}
*/