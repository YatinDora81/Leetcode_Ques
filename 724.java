// 724. Find Pivot Index


class Solution {
    public int pivotIndex(int[] nums) {
        int pref[]=new int[nums.length];
        pref[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            pref[i] = pref[i-1] + nums[i];
        }

        for(int i=0;i<nums.length;i++){
            int ls=0;
            if(i>0) ls = pref[i-1];

            int rs = pref[pref.length-1] -ls -nums[i];
            if(ls==rs) return i;
        }
        return -1;
    }
}