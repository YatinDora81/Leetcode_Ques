// // 1291. Sequential Digits

// class Solution {
//     public List<Integer> sequentialDigits(int low, int high) {
//         List<Integer> ll=new ArrayList<>();
//         String s="123456789";
//         int n = (""+low).length();
//         int m = (""+high).length();

//         for(int i=n;i<=m;i++){
//             for(int j = 0;j<10-i;j++){
//                 int num = Integer.parseInt(s.substring(j,j+i));
//                 if(num>high) break;
//                 if(num>=low && num<=high) ll.add(num);
//             }
//         }
//         return ll;
//     }
// }