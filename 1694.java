// // 1694. Reformat Phone Number

// class Solution {
//     public String reformatNumber(String s) {
//         List<String> ll = new ArrayList<>();
//         StringBuilder sb = new StringBuilder("");
//         for(char ch : s.toCharArray()){
//             if(ch>='0' && ch<='9'){
//                 sb.append(ch);
//                 if(sb.length()==3){
//                     ll.add(sb.toString());
//                     sb = new StringBuilder();
//                 }
//             }
//         }
//         if(sb.length()>0) ll.add(sb.toString());
        
//         StringBuilder ans = new StringBuilder("");
//         if(ll.size()==1) return ll.get(0);
//         for(int i=0;i<ll.size();i++){
//             if(i==ll.size()-2){
//                 if(ll.get(ll.size()-1).length()==2){
//                     ans.append(ll.get(ll.size()-2) + "-" + ll.get(ll.size()-1));
//                 }
//                 else if(ll.get(ll.size()-1).length()==1){
//                     ans.append( ll.get(ll.size()-2).charAt(0) + "" + ll.get(ll.size()-2).charAt(1) + "-" + ll.get(ll.size()-2).charAt(2) + "" + ll.get(ll.size()-1) );
//                 }
//                 else if(ll.get(ll.size()-1).length()==3) ans.append(ll.get(ll.size()-2)+"-"+ll.get(ll.size()-1));
//                 break;
//             }
//             else ans.append( ll.get(i) + "-" );
//         }
//         return ans.toString();
//     }
// }