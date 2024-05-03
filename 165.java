// // 165. Compare Version Numbers

// class Solution {
//     public int compareVersion(String t1, String t2) {

//         //optimize it or clean the code

//         List<String> ll1= splitIt(t1);
//         List<String> ll2= splitIt(t2);

//         int n = 0;
//         if(ll1.size()<ll2.size()) n=ll1.size();
//         else n=ll2.size();

//         for(int i=0;i<n;i++){
//             if(  !ll1.get(i).equals(ll2.get(i)) ){
//                 if( ll1.get(i).length() !=ll2.get(i).length() ){
//                     if(ll1.get(i).length() < ll2.get(i).length() ) updatee( ll1 , i, Math.abs(ll1.get(i).length() - ll2.get(i).length())  ); 
//                     else updatee( ll2 , i, Math.abs(ll1.get(i).length() - ll2.get(i).length())  ); 

//                     System.out.println(ll1.get(i));
//                     System.out.println(ll1.get(i));
//                 }
//                 if(ll1.get(i).compareTo(ll2.get(i))<0 ) return -1;
//                 else if(ll1.get(i).compareTo(ll2.get(i))>0) return 1;
//             }
//         }

//         if(ll1.size()==ll2.size()) return 0;
//         else if(ll1.size()<ll2.size()) return -1;
//         return 1;
//     }
//     void updatee(List<String> ll , int ind ,int z){
//         StringBuilder sb=new StringBuilder();
//         for(int i=0;i<z;i++) sb.append("0");
//         sb.append(ll.get(ind));
//         ll.set(ind,sb.toString());
//     }
//     List<String> splitIt(String s){
//         StringBuilder sb=new StringBuilder("");
//          List<String> ll  = new ArrayList<>();
//         for(char ch : s.toCharArray()){
//             if(ch=='.'){
//                 ll.add(sb.toString());
//                 sb=new StringBuilder();
//             }
//             else sb.append(ch);
//         }
//         ll.add(sb.toString());
//         delete(ll);
//         return ll;
//     }

//     void delete(List<String> ll){
//         for(int i=ll.size()-1;i>=0;i--){
//             if( gg(ll.get(i)) ) break;
//             else ll.remove(i);
//         }
//     }

//     boolean gg(String s){
//         return s.contains("1") || s.contains("2") || s.contains("3") || s.contains("4") || s.contains("5") || s.contains("6") || s.contains("7") || s.contains("8") || s.contains("9") ;  
//     }
// }