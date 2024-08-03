// // 2566. Maximum Difference by Remapping a Digit

// class Solution {
//     public int minMaxDifference(int num) {
//         String []arr = (""+num).split("");
//         int maxi = 0;
//         int i=0;
//         while(i<arr.length && arr[i].equals("9")){
//             i++;
//         }
//         if(i<arr.length){
//             maxi = arr[i].charAt(0) - '0';
//             for(i=0;i<arr.length;i++){
//                 if(arr[i].equals("" + maxi) ) arr[i] = "9";
//             }
//             System.out.println(Arrays.toString(arr));
//         }

//         String []arr2 = (""+num).split("");
//         maxi = 0;
//         i=0;
//         while(i<arr2.length && arr2[i].equals("0")){
//             i++;
//         }
//         if(i<arr2.length){
//             maxi = arr2[i].charAt(0) - '0';
//             for(i=0;i<arr2.length;i++){
//                 if(arr2[i].equals("" + maxi) ) arr2[i] = "0";
//             }
//             System.out.println(Arrays.toString(arr2));
//         }

//         StringBuilder sb1 = new StringBuilder("");
//         for(String s : arr) sb1.append(s);
//         StringBuilder sb2 = new StringBuilder("");
//         for(String s : arr2) sb2.append(s);
        

//         return Integer.parseInt(sb1.toString()) - Integer.parseInt(sb2.toString());
//     }
// }