// // 2485. Find the Pivot Integer

// class Solution {
//     public int pivotInteger(int n) {
//         for(int i=1;i<=n;i++) if(isposs(i,n)) return i;
//         return -1;
//     }

//     boolean isposs(int i,int n){
//         int s= i*(i+1)/2;
//         int e = (n*(n+1)/2 ) - ( (i-1)*(i-1+1)/2 );
//         return e==s;
//     }
// }



// binary search
class Solution {
    public int pivotInteger(int n) {
        // binarySearch
        int l = 0;
        int h = n;
        while(l<=h){
            int mid = h + (l-h)/2;
            int arr[] = isposs(mid,n);
            if(arr[0] == arr[1]) return mid;
            else if(arr[0]<arr[1]){
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
        return -1;
    }
    int[] isposs(int i,int n){
        int s = i*(i+1)/2;
        int e = (n*(n+1)/2) - (i-1)*(i-1+1)/2 ;
        int arr[]=new int[2];
        arr[0]=s;
        arr[1]=e;
        return arr;
    }
}