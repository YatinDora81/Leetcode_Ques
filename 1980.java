// // 1980. Find Unique Binary String

// class Solution {
//     public String findDifferentBinaryString(String[] nums) {
//         HashSet<String> set=new HashSet<>();
//         for(String ss : nums) set.add(ss);
//         String ans[] = {""};
//         tell(0,nums[0].length(),"",ans,set);
//         return ans[0];
//     }

//     boolean tell( int i , int n, String s ,String ans[] , HashSet<String> set ){
//         if(i==n){
//             if(!set.contains(s)){
//                 ans[0] = s;
//                 return true;
//             }
//             return false;
//         }

//         boolean a = tell(i+1,n,s+'1',ans,set);
//         if(a==true) return true;
//         a = a || tell(i+1,n,s+'0',ans,set);

//         return a;
//     }
// }