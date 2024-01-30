// // 648. Replace Words

// class Solution {
//     public String replaceWords(List<String> ll, String s) {
//         String arr[]=s.trim().split(" ");
//         for(int i=0;i<arr.length;i++){
//             for(int j=0;j<ll.size();j++){
//                 if(arr[i].startsWith(ll.get(j))){
//                     arr[i]=ll.get(j);
//                 }
//             }
//         }
//         StringBuilder sb=new StringBuilder();
//         for(int i=0;i<arr.length;i++){
//             if(i==arr.length-1){
//                 sb.append(arr[i]);
//             }
//             else sb.append(arr[i] +  " ");
//         }
//         return sb.toString();
//     }
// }