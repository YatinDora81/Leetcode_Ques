// // 2160. Minimum Sum of Four Digit Number After Splitting Digits

// class Solution {
//     public int minimumSum(int num) {
//         List<String> ll = new ArrayList<>();
//         permute( 0 , (num+"").split(""), ll );
//         // System.out.println(ll.size());
//         int mini[] = {Integer.MAX_VALUE};
//         for(String s : ll) solve(0, s , "" , "" , mini);
//         return mini[0];
//     }
//     void permute(int ind,  String arr[] , List<String> ll){
//         if(ind==arr.length){
//             StringBuilder sb = new StringBuilder();
//             for(String s : arr) sb.append(s);
//             ll.add(sb.toString());
//             return;
//         }

//         for(int i =ind;i<arr.length;i++){
//             swap(arr , i ,ind);
//             permute(ind+1 , arr , ll);
//             swap(arr , i ,ind);
//         }
//     }
//     void swap(String arr[]  ,int i,int j){
//         String t = arr[i];
//         arr[i] = arr[j];
//         arr[j] = t;
//     }

//     void solve(int ind , String s , String a , String b ,int[] mini){
//         if(a.length()>0 && b.length()>0){
//             int c= Integer.parseInt(a);
//             int d= Integer.parseInt(b);
//             mini[0] = Math.min(mini[0] , c+d);
//             // System.out.println(c +" " +d);
//             return;
//         }
//         if(ind==s.length()){
//             if(a.length()>0 && b.length()>0){
//                 int c= Integer.parseInt(a);
//                 int d= Integer.parseInt(b);
//                 mini[0] = Math.min(mini[0] , c+d);
//             }
//             return;
//         }

//         solve(ind+1 , s , a+s.substring(0,ind+1) , b+s.substring(ind+1) , mini );
//         solve(ind+1 , s , a, b ,mini );
        
//     }
// }