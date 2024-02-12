// // 547. Number of Provinces
// // bfs dfs both codes

// class Solution {

//     public void dfs(int [][]graph,boolean vis[],int curr,int n){
//         vis[curr]=true;
//         for(int i=0;i<n;i++){
//             if(graph[curr][i]==1 && !vis[i]) dfs(graph,vis,i,n);
//         }
//     }

//     public int findCircleNum(int[][] graph) {
//         int n=graph.length;
//         boolean []vis=new boolean[n];
//         int ans=0;
//         // for(int i=0;i<n;i++){
//         //     if(!vis[i]){
//         //         ans++;
//         //         dfs(graph,vis,i,n);
//         //     }
//         // }

//         for(int i=0;i<n;i++){
//             if(!vis[i]){
//                 ans++;
//                 //bfs code
//                 Queue<Integer> q=new LinkedList<>();
//                 q.add(i);
//                 vis[i]=true;

//                 while(q.size()>0){
//                     int curr = q.remove();
//                     for(int j=0;j<n;j++){
//                         if(graph[curr][j]==1 && !vis[j] ){
//                             q.add(j);
//                             vis[curr]=true;
//                         }
//                     }
//                 }

//             }
//         }

//         return ans;
//     }
// }