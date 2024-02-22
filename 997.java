// // 997. Find the Town Judge


// class Solution {
//     public int findJudge(int n, int[][] trust) {
//         int arr[]=new int[n+1];
//         HashSet<Integer> set=new HashSet<>();
//         for(int i=0;i<trust.length;i++){
//             arr[trust[i][1]] +=1;
//             set.add(trust[i][0]);
//         }

//         int ans = -1;
//         for(int i=1;i<=n;i++){
//             if(arr[i]==n-1 && !set.contains(i)) return i;
//         }
//         return ans;
//     }
// }