// // 2225. Find Players With Zero or One Losses
// class Solution {
//     public List<List<Integer>> findWinners(int[][] arr) {
//         List<List<Integer>> ans=new ArrayList<>();
//         List<Integer> onlywin=new ArrayList<>();
//         List<Integer> oneloss=new ArrayList<>();
//         HashMap<Integer,Integer> map=new HashMap<>();
//         for(int i=0;i<arr.length;i++){
//             if(map.containsKey(arr[i][0])){
//                 map.put(arr[i][0], map.get(arr[i][0]) +1 );
//                 if(map.containsKey(-arr[i][1])) map.put(-arr[i][1] , map.get(-arr[i][1]) +1);
//                 else map.put(-arr[i][1],1);
//             }
//             else{
//                 map.put(arr[i][0], 1);
//                 if(map.containsKey(-arr[i][1])) map.put(-arr[i][1] , map.get(-arr[i][1]) +1);
//                 else map.put(-arr[i][1],1);
//             }
//         }
//         for(int i : map.keySet()){
//             if(i>0 && !map.containsKey(-i)) onlywin.add(i);
//             if(i<0 && map.containsKey(i)  && map.get(i)==1) oneloss.add(-i);
//         }
//         Collections.sort(onlywin);
//         Collections.sort(oneloss);
//         ans.add(onlywin);
//         ans.add(oneloss);
//         return ans;
//     }
// }