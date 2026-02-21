// class Solution {
//     public int dayOfYear(String date) {
//         String s1[] = date.split("-");
//         int arr[] = new int[s1.length];
//         for(int i=0;i<arr.length;i++) arr[i] = Integer.parseInt(s1[i]);
//         int days[] = {31,28,31,30,31,30,31,31,30,31,30,31};
//         if(arr[0]%400==0 || ( arr[0]%4==0 && arr[0]%100!=0 ) ) days[1] = 29;

//         int ans = arr[2];
//         for(int i=0;i<arr[1]-1;i++) ans += days[i];
//         return ans;

//     }
// }