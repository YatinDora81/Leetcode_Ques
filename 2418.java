// // 2418. Sort the People

// class Solution {
//     class pair{
//         int n;
//         String s;
//         pair(int n , String s){
//             this.s=s;
//             this.n=n;
//         }
//     }
//     public String[] sortPeople(String[] names, int[] heights) {
//         pair[] arr = new pair[names.length];
//         for(int i=0;i<names.length;i++){
//             arr[i] = new pair(heights[i] , names[i]);
//         }
//         Arrays.sort(arr , (a,b)->{
//             if(a.n-b.n<0) return 1;
//             else if(a.n-b.n>0) return -1;
//             return 0;
//         });

//         String ans[] = new String[arr.length];
//         for(int i=0;i<arr.length;i++){
//             ans[i] = new String(arr[i].s);
//         }
//         return ans;

//     }
// }