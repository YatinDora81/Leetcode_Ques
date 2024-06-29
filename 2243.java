// // 2243. Calculate Digit Sum of a String

// class Solution {
//     public String digitSum(String s, int k) {
//         while(s.length()>k){
//             String arr[] = spli(s,k);
//             for(int i=0;i<arr.length;i++){
//                 String t = arr[i];
//                 String nums[] = t.split("");
//                 long ans = 0;
//                 for(String h : nums){
//                     ans+=Integer.parseInt(h);
//                 }
//                 arr[i]=ans+"";
//             }
//             StringBuilder sb = new StringBuilder();
//             for(String h : arr) sb.append(h);
//             s = sb.toString();
//         }
//         return s;
//     }
//     String [] spli(String s,int k){
        
//         List<String> ll = new ArrayList<>();
//         StringBuilder sb = new StringBuilder();

//         for(int i=0;i<s.length();i++){
//             sb.append(s.charAt(i));
//             if(sb.length()==k){
//                 ll.add(sb.toString());
//                 sb =new StringBuilder();
//             }
//         }
//         if(sb.length()>0){
//                 ll.add(sb.toString());
//         }
//         String arr[] = new String[ll.size()];
//         for(int i=0;i<ll.size();i++) arr[i] = ll.get(i);

//         return arr;
//     }
// }