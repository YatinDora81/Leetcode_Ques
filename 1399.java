// // 1399. Count Largest Group

// class Solution {
//     public int countLargestGroup(int n) {
//         HashMap<Integer,List<Integer>> map = new HashMap<>();
//         for(int i=1;i<=n;i++){
//             char []arr = (i+"").toCharArray();
//             int sum = 0;
//             for(char ch : arr) sum+= ch-'0';
//             if(!map.containsKey(sum)) map.put(sum,new ArrayList<>());
//             map.get(sum).add(i);
//         }
//         int maxi = 0;
//         for(int i : map.keySet()) maxi = Math.max(maxi,map.get(i).size());
//         int ans=0;
//         for(int i : map.keySet()) if(map.get(i).size()==maxi) ans++;
//         return ans;
//     }
// }