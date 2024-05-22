// // 890. Find and Replace Pattern

// class Solution {
//     public List<String> findAndReplacePattern(String[] words, String pat) {
//         List<String> ll=new ArrayList<>();
//         HashMap<Character,List<Integer>> org = new HashMap<>();
//         for(int i=0;i<pat.length();i++){
//             char ch = pat.charAt(i);
//             if(org.containsKey(ch)){
//                 org.get(ch).add(i);
//             }
//             else{
//                 org.put(ch , new ArrayList<>());
//                 org.get(ch).add(i);
//             }
//         }

//         System.out.print(org);


//         for( String s : words ){
//             HashMap<Character,List<Integer>> map = new HashMap<>();
//             for(int i=0;i<s.length();i++){
//                 char ch = s.charAt(i);
//                 if(map.containsKey(ch)){
//                     map.get(ch).add(i);
//                 }
//                 else{
//                     map.put(ch , new ArrayList<>());
//                     map.get(ch).add(i);
//                 }
//             }
//             boolean f = true;
//             for( int i=0;i<s.length();i++ ){
//                 if( !is( map.get(s.charAt(i)) , org.get(pat.charAt(i))  ) ) f=false;
//             }

//             if(f) ll.add(s);
//         }

//         return ll;

        
//     }

//     boolean is(List<Integer> ll1 , List<Integer> ll2){
//         return ll1.equals(ll2);
//     }
// }