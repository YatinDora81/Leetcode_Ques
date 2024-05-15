// // 884. Uncommon Words from Two Sentences

// class Solution {
//     public String[] uncommonFromSentences(String s1, String s2) {
//         HashMap<String,Integer> map=new HashMap<>();
//         for(String s : s1.split(" ")){
//             if(map.containsKey(s)) map.put( s,map.get(s)+1 );
//             else map.put(s,1);
//         }
//         for(String s : s2.split(" ")){
//             if(map.containsKey(s)) map.put( s,map.get(s)+1 );
//             else map.put(s,1);
//         }
//         List<String> ll=new ArrayList<>();
//         for(String s : map.keySet()){
//             if( map.get(s)==1 ) ll.add(s);
//         }

//         String arr[]=new String[ll.size()];
//         for(int i=0;i<ll.size();i++){
//             arr[i]=ll.get(i);
//         }
//         return arr;
//     }
// }