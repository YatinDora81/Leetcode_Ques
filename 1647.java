// // 1647. Minimum Deletions to Make Character Frequencies Unique


// class Solution {
//     public int minDeletions(String s) {
//         int arr[] = new int[26];
//         for(char ch : s.toCharArray()){
//             arr[ch-'a'] += 1;
//         }
//         Arrays.sort(arr);
//         int ans = 0;
//         for(int i=arr.length-2;i>=0;i--){
//             if(arr[i]==0) break;
//             if(arr[i]>=arr[i+1]){
//                 int t = arr[i];
//                 arr[i] = Math.max(0 , arr[i+1]-1);
//                 ans += t - arr[i];
//             }
//         }
//         return ans;
//     }
// }





// class Solution {
//     public int minDeletions(String s) {
//         HashMap<Character,Integer> map = new HashMap<>();
//         for(char ch : s.toCharArray()){
//             if(map.containsKey(ch)) map.put(ch,map.get(ch)+1);
//             else map.put(ch,1);
//         }
//         int ans = 0;
//         HashSet<Integer> set = new HashSet<>();

//         for(char ch : map.keySet()){
//             if(!set.contains(map.get(ch))) set.add(map.get(ch));
//             else{
//                 int l = map.get(ch);
//                 while(l>=1 && set.contains(l)) l--;
//                 if(l==0) ans += map.get(ch);
//                 else{
//                     ans += map.get(ch) - l;
//                     set.add(l);
//                 }
//             }
//         }
//         return ans;
//     }
// }