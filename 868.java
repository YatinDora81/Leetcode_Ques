// class Solution {
//     public int binaryGap(int n) {
//         List<Integer> ll = new ArrayList<>();
//         String s = Integer.toBinaryString(n);
//         for(int i=0;i<s.length();i++){
//             if(s.charAt(i)=='1') ll.add(i);
//         }
//         int ans = 0;
//         for(int i=1;i<ll.size();i++){
//             ans = Math.max(ans , ll.get(i)-ll.get(i-1));
//         }
//         return ans;    
//     }
// }