// // 2451. Odd String Difference

// class Solution {
//     public String oddString(String[] words) {
//         HashMap<List<Integer>,List<String>> map = new HashMap<>();
//         int c=0;
//         for(String s : words){
//             c++;
//             List<Integer> ll = new ArrayList<>();
//             for(int i=1;i<s.length();i++){
//                 ll.add(s.charAt(i)-s.charAt(i-1));
//             }
//             if(map.containsKey(ll)){
//                 map.get(ll).add(s);
//             }
//             else{
//                 map.put(ll,new ArrayList<>());
//                 map.get(ll).add(s);
//             }
//             if(map.size()>1 && c>=3){
//                 for(List<Integer> ds : map.keySet()){
//                     if(map.get(ds).size()==1) return map.get(ds).get(0);
//                 }
//             }
//         }
//         return "";
//     }
// }