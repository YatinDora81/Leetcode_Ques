// // 2264. Largest 3-Same-Digit Number in String

// class Solution {
//     public String largestGoodInteger(String s) {
//         HashMap<Character,Integer> map=new HashMap<>();
//         char ch=' ';
//         int i=0,j=0;
//         while(j<s.length()){
//             //put jth ele
//             if(map.containsKey(s.charAt(j))) map.put( s.charAt(j) , map.get(s.charAt(j))+1 );
//             else map.put(s.charAt(j) , 1 );

//             j++;

//             if(j-i+1<4) continue;
//             else if( j-i+1==4 ){
//                 // System.out.println(map);
//                 if(map.size()==1){
//                     if(ch<s.charAt(i)) ch=s.charAt(i);
//                 }
//                 //remove for ith ele
//                 if(map.get(s.charAt(i))==1) map.remove(s.charAt(i));
//                 else map.put( s.charAt(i) , map.get(s.charAt(i))-1 );
//                 i++;
//             }
//         }
//         if(ch!=' ') return ""+ch+ch+ch;
//         return "";
//     }
// }