// // 3014. Minimum Number of Pushes to Type Word I

// class Solution {
//     public int minimumPushes(String s) {
//         HashMap<Character,Integer> map = new HashMap<>();
//         for(char ch : s.toCharArray()){
//             if(map.containsKey(ch)) map.put(ch,map.get(ch)+1);
//             else map.put(ch,1);
//         }
//         // char []arr = s.toCharArray();.
//         List<Character> arr = new ArrayList<>();
//         for(char ch : s.toCharArray()) arr.add(ch);
//         Collections.sort(arr,(c1,c2)->{
//             int l1 = map.get(c1);
//             int l2 = map.get(c2);
//             if(l1-l2<0) return 1;
//             else if(l1-l2>0) return -1;
//             else{
//                 if(c1-c2<0) return -1;
//                 else if(c1-c2>0) return 1;
//                 else return 0;
//             }
//         });

//         // System.out.println(arr);

//         HashSet<Character> set = new HashSet<>();
//         int curr = 1;
//         int ans = 0;
//         for( char ch : arr ){
//             if(set.contains(ch)){
//                 ans += curr;
//             }
//             else{
//                 if(set.size()==8){
//                     curr++;
//                     set = new HashSet<>();
//                 }
//                 set.add(ch);
//                 ans += curr;
//             }
//             // System.out.println(ch + " " + curr + " " + ans);
//         }

//         return ans;
//     }
// }