// // 1807. Evaluate the Bracket Pairs of a String

// class Solution {
//     public String evaluate(String s, List<List<String>> know) {
//         HashMap<String,String> map = new HashMap<>();
//         for(int i=0;i<know.size();i++){
//             map.put( know.get(i).get(0) , know.get(i).get(1) );
//         }

//         StringBuilder sb = new StringBuilder("");
//         boolean f = false;
//         StringBuilder ans = new StringBuilder("");

//         for( char ch : s.toCharArray() ){
//             if(ch=='('){
//                 f = true;
//             }
//             else if(ch==')'){
//                 f = false;
//                 if(map.containsKey(sb.toString())){
//                     ans.append(map.get(sb.toString()));
//                 }
//                 else ans.append("?");
//                 sb = new StringBuilder();
//             }
//             else if(f){
//                 sb.append(ch);
//             }
//             else{
//                 ans.append(ch);
//             }
//         }

//         // System.out.print(map);

//         return ans.toString();
//     }
// }