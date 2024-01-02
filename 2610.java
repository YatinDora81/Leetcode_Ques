//2610
// https://leetcode.com/problems/convert-an-array-into-a-2d-array-with-conditions/description/?envType=daily-question&envId=2024-01-02

class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> arr=new ArrayList<>();
        for(int i : nums){
            arr.add(i);
        }

        while(arr.size()!=0){
            List<Integer> ll=new ArrayList<>();
            HashSet<Integer> set=new HashSet<>();
            int i=0;
            while(i<arr.size()) {
                if(set.contains(arr.get(i))){
                    i++;
                }
                else{
                    set.add(arr.get(i));
                    ll.add(arr.get(i));
                    arr.remove(i);
                }
            }
            ans.add(ll);
        }
        return ans;
    }
}