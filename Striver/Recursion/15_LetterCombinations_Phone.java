// class Solution {
//     public List<String> letterCombinations(String digits) {
//         String arr[] = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
//         List<String> ans= new ArrayList<>();
//         if(digits.length()==0) return ans;
//         solve(0,digits,"",ans,arr);
//         return ans;
//     }
//     public void solve(int ind , String digits , String s , List<String> ll , String arr[]){
//         if(ind==digits.length()){
//             ll.add(s);
//             return ;
//         }

//         int num = digits.charAt(ind) - '0';
//         for(char ch : arr[num].toCharArray()){
//             solve(ind+1 , digits , s + ch , ll , arr);
//         }
//     }
// }