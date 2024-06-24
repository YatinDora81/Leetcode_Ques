// // 2788. Split Strings by Separator

// class Solution {
//     public List<String> splitWordsBySeparator(List<String> words, char separator) {
//         List<String> ans = new ArrayList<>();
//         for(String s : words){
//             List<String> arr = spl(s,separator);
//             for(String t : arr) if(is(t)) ans.add(t);
//         }
//         return ans;
//     }
//     boolean is(String t){
//         StringBuilder sb = new StringBuilder();
//         for(char ch : t.toCharArray()){
//             if(ch!=' ') sb.append(ch);
//         }
//         return sb.length()>0;
//     }

//     List<String> spl(String s , char l){
//         List<String> ll = new ArrayList<>();
//         StringBuilder sb = new StringBuilder();
//         for(char ch : s.toCharArray()){
//             if(ch==l){
//                 ll.add(sb.toString());
//                 sb = new StringBuilder();
//             }
//             else{
//                 sb.append(ch);
//             }
//         }
//         if(sb.length()>0) ll.add(sb.toString());
//         return ll;
//     }
// }