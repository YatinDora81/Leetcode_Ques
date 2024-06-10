// // 1051. Height Checker

// class Solution {
//     public int heightChecker(int[] arr1) {
//         int arr2[] = new int[arr1.length];
//         for(int i=0;i<arr2.length;i++) arr2[i]=arr1[i];
//         Arrays.sort(arr2);
//         int c=0;
//         for(int i=0;i<arr2.length;i++) if(arr1[i]!=arr2[i]) c++;
//         return c;
//     }
// }