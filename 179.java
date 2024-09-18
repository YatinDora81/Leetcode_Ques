// // 179. Largest Number

// class Solution {
//     public String largestNumber(int[] nums) {
//         // basically here we are sorting acc to 2 String that whether a+b is grater or b+a is greater if a+b is grater then a comes first
//         String arr[] = new String[nums.length];
//         for(int i=0;i<nums.length;i++) arr[i] = nums[i] + "";
//         Arrays.sort(arr , (a,b)->{
//             if( ( a+b+"" ).compareTo( b+a+"" ) > 0 ) return -1;
//             else return 1;
//         });
//         StringBuilder sb = new StringBuilder();
//         for(String s  :  arr)  sb.append(s);
//         while(sb.length()>1 && sb.charAt(0)=='0') sb.deleteCharAt(0);
//         return sb.toString();
//     }
// }