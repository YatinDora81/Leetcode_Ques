// // 785. Is Graph Bipartite?

// class Solution {
//     public class pair{
//         int a;int b;
//         public pair(int a,int b){
//             this.a=a;
//             this.b=b;
//         }
//     }
//     public boolean isBipartite(int[][] graph) {
//         int n = graph.length;
//         int vis[] = new int[n];
//         Arrays.fill(vis,-1);
//         for(int i=0;i<n;i++){
//             if( vis[i]==-1 ){
//                 Queue<pair> q = new LinkedList<>();
//                 q.add( new pair(i,0) );
//                 vis[i] = 0;

//                 while(q.size()>0){
//                     pair p = q.remove();
//                     int col = p.b;
//                     int curr = p.a;

//                     for(int nei : graph[curr]){
//                         if(vis[nei]==-1){
//                             q.add(new pair( nei , col==0 ? 1 : 0 ) );
//                             vis[nei] = col==0 ? 1 : 0;
//                         }
//                         else if( vis[nei] == col ){
//                             return false;
//                         }
//                     }
//                 }

//             }
//         }
//         return true;
//     }
// }