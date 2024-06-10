// // 929. Unique Email Addresses
// class Solution {
//     public int numUniqueEmails(String[] emails) {
//         HashSet<String> set= new HashSet<>();
//         for(String email : emails){
//             String arr[] = email.split("@");
//             arr[0] = tell( arr[0] );
//             set.add(arr[0]+"@"+arr[1]);         
//         }
//         return set.size();
//     }
//     String tell(String s){
//         StringBuilder sb=new StringBuilder();
//         for(char ch : s.toCharArray()){
//             if(ch=='+') break;
//             else if(ch=='.') continue;
//             else sb.append(ch);
//         }
//         return sb.toString();
//     }

// }