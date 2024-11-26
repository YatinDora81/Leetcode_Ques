// // 2924. Find Champion II

// class Solution {
//     public int findChampion(int n, int[][] edges) {
//         int indegree[] = new int[n];
//         for(int ed[] : edges){
//             int u = ed[0] , v = ed[1];
//             indegree[v] += 1;
//         }
//         int ind = -1;
//         for(int i=0;i<indegree.length;i++){
//             if( indegree[i]==0 ){
//                 if( ind!=-1 ) return -1;
//                 ind = i;
//             }
//         }
//         return ind;
//     }
// }