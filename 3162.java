// 3162. Find the Number of Good Pairs I

class Solution {
    public int numberOfPairs(int[] nums1, int[] nums2, int k) {
        int c=0;
        for(int i : nums1){
            for(int j : nums2){
                if(i%(j*k)==0) c++;
            }
        }
        return c;
    }
}