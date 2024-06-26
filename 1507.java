// // 1507. Reformat Date

// class Solution {
//     public String reformatDate(String s) {
//         StringBuilder sb = new StringBuilder("");
//         String arr[] = s.split(" ");
//         sb.append(arr[2]+"-");
//         if(arr[1].equals("Jan")) sb.append("01-");
//         else if(arr[1].equals("Feb")) sb.append("02-");
//         else if(arr[1].equals("Mar")) sb.append("03-");
//         else if(arr[1].equals("Apr")) sb.append("04-");
//         else if(arr[1].equals("May")) sb.append("05-");
//         else if(arr[1].equals("Jun")) sb.append("06-");
//         else if(arr[1].equals("Jul")) sb.append("07-");
//         else if(arr[1].equals("Aug")) sb.append("08-");
//         else if(arr[1].equals("Sep")) sb.append("09-");
//         else if(arr[1].equals("Oct")) sb.append("10-");
//         else if(arr[1].equals("Nov")) sb.append("11-");
//         else if(arr[1].equals("Dec")) sb.append("12-");
//         StringBuilder sb1 = new StringBuilder("");
//         for(int i=0;i<arr[0].length();i++){
//             if( !(arr[0].charAt(i)>='0' && arr[0].charAt(i)<='9') ) break;
//             sb1.append(arr[0].charAt(i));
//         }
//         if(sb1.length()==1) sb.append("0");
//         sb.append(sb1.toString());
//         return sb.toString();
//     }
// }