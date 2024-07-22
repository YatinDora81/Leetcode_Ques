// // 386. Lexicographical Numbers

// class Solution {
//     public List<Integer> lexicalOrder(int n) {
//         List<String> ll = new ArrayList<>();
//         for(int i=1;i<=n;i++) ll.add(i+"");
//         Collections.sort(ll);
//         List<Integer> ans = new ArrayList<>();
//         for(String i : ll) ans.add(Integer.parseInt(i));
//         return ans;
//     }
// }