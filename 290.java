// class Solution {
//     public boolean wordPattern(String s1, String s2) {
//         String arr1[] = s1.split("");
//         String arr2[] = s2.split(" ");
//         HashMap<String,String> map = new HashMap<>();
//         if(arr1.length!=arr2.length) return false;
//         for(int i=0;i<arr1.length;i++){
//             if(!map.containsKey(arr1[i])) map.put(arr1[i] , arr2[i]);
//             else if(map.containsKey(arr1[i]) && !map.get(arr1[i]).equals(arr2[i]) ) return false;
//         }
//         HashMap<String,String> map2 = new HashMap<>();
//         for(int i=0;i<arr1.length;i++){
//             if(!map2.containsKey(arr2[i])) map2.put(arr2[i] , arr1[i]);
//             else if(map2.containsKey(arr2[i]) && !map2.get(arr2[i]).equals(arr1[i]) ) return false;
//         }

//         return map.size()==map2.size();
//     }
// }