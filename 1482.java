// 1482. Minimum Number of Days to Make m Bouquets

class Solution {
    public int minDays(int[] arr, int m, int k) {
        if( m * k >  arr.length ) return -1;
        int mini = arr[0] , maxi = arr[0];
        for(int i : arr){
            maxi = Math.max(maxi,i);
            mini = Math.min(mini,i);
        }

        int s = mini;
        int e = maxi;
        int ans = -1;
        while(s<=e){
            int mid = s + (e-s)/2;
            if( isPoss(arr , mid, m, k) ){
                ans = mid;
                e = mid-1;
            }
            else s = mid+1;
        }
        return ans;
    }
    boolean isPoss(int []arr , int mid , int m ,int k ){
        int c = 0;
        int b = 0;
        for(int i=0;i<arr.length;i++){
            if(b>=m) return true;
            if( arr[i]<=mid ){
                c++;
            }
            else{
                c=0;
            }
            if(c>=k){
                b++;
                c=0;
            }
            if(b>=m) return true;
        }

        return b>=m;
    }
}