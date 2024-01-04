// 2870. Minimum Number of Operations to Make Array Empty

class Solution {
    public int minOperations(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i : nums){
            if(map.containsKey(i)) map.put(i,map.get(i)+1);
            else map.put(i,1);
        }
        
        List<Integer> ll=new ArrayList<>();
        for(int i : map.keySet()){
            ll.add(map.get(i));
        }
        
        int ans=0;

        for(int i=0;i<ll.size();i++){
            if(ll.get(i) == 1 ) return -1;
            while(ll.get(i)>1){
                ans+=1;
                if(ll.get(i) % 3 ==0) ll.set(i,ll.get(i)-3); 
                else ll.set(i,ll.get(i)-2); 
            }
        }

        return ans;
    }
}