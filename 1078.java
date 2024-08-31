// // 1078. Occurrences After Bigram

// class Solution {
//     public String[] findOcurrences(String s, String t1, String t2) {
//         String arr[] = s.trim().split(" ");
//         List<String> ll = new ArrayList<>();
//         for(int i=0;i<arr.length-2;i++){
//             if( arr[i].equals(t1) && arr[i+1].equals(t2) ) ll.add(arr[i+2]);
//         }
//         String ans[] = new String[ll.size()];
//         for(int i=0;i<ans.length;i++){
//             ans[i] = ll.get(i);
//         }
//         return ans;
//     }
// }