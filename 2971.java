// 2971. Find Polygon With the Largest Perimeter

import java.util.*;
class Solution {
    public long largestPerimeter(int[] nums) {
        //intiution here nums[i] not greater or equal to prefix sum 
        
        Arrays.sort(nums);
        
        // long pref[]=new long[nums.length];
        long total=0;
        for(int i=0;i<nums.length;i++){
            total+=nums[i];
            // if(i==0) pref[i]=nums[i];
            // else pref[i] = nums[i] + pref[i-1];
        }

        for(int i=nums.length-1;i>=2;i--){
            if(nums[i]< total - nums[i]) return total;
            total-=nums[i];
        }
        return -1;
    }
}