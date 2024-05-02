// // 2053. Kth Distinct String in an Array

// class Solution {
//     public String kthDistinct(String[] arr, int k) {
//         HashMap<String,Integer> map=new HashMap<>();
//         List<String> ll = new ArrayList<>();
//         for(String s : arr){
//             if(map.containsKey(s)) map.put(s,2);
//             else map.put(s,1);
//         }

//         for(String s : arr){
//             if(map.get(s)==1) ll.add(s);
//         }

//         System.out.print(ll);
//         if(k>ll.size()) return "";
//         return ll.get(k-1);
//     }
// }