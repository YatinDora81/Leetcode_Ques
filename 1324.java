// // 1324. Print Words Vertically

// class Solution {
//     public List<String> printVertically(String s) {
//         List<String> ans = new ArrayList<>();
//         String arr[] = s.split(" ");
//         int maxi = 0;
//         for(String ss : arr) maxi = Math.max(maxi , ss.length());

//         for(int i=0;i<maxi;i++){
//             StringBuilder sb = new StringBuilder();
//             sb.append("-");
//             for(int j=0;j<arr.length;j++){
//                 if( i<arr[j].length() ) sb.append(arr[j].charAt(i));
//                 else sb.append(" ");
//             }
//             ans.add( sb.toString().trim().substring(1) );
//         }
//         return ans;
//     }
// }