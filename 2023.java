// 2023. Number of Pairs of Strings With Concatenation Equal to Target

class Solution {
    public int numOfPairs(String[] nums, String target) {
        int ans = 0 ;
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                if(i==j) continue;
                if( (nums[i]+nums[j]).equals(target) ) ans+=1;
                if( (nums[j]+nums[i]).equals(target) ) ans+=1;
            }
        }
        return ans;
    }
}