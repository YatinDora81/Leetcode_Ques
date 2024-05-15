// // 2490. Circular Sentence

// class Solution {
//     public boolean isCircularSentence(String s) {
//         String []arr=s.split(" ");
//         for(int i=0;i<arr.length;i++){
//             if(i==0){
//                 if( arr[0].charAt(0) != arr[arr.length-1].charAt( arr[arr.length-1].length()-1 ) ) return false;
//                 continue;
//             }
//             if( arr[i].charAt(0) != arr[i-1].charAt(arr[i-1].length()-1) ) return false;
//         }
//         return true;
//     }
// }