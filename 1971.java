// // 1971. Find if Path Exists in Graph

// class Solution {
//     public boolean validPath(int n, int[][] edges, int source, int destination) {
//         Map<Integer,List<Integer>> graph=new HashMap<>();

//         for(int edge[] : edges){
//             int u=edge[0] , v=edge[1];
//             graph.computeIfAbsent( u , value->new ArrayList<>() ).add(v);
//             graph.computeIfAbsent( v , value->new ArrayList<>() ).add(u);
//         }

//         boolean vis[]=new boolean[n];

//         return dfs(graph , source, destination , vis ,n);
//     }
//     public boolean dfs(Map<Integer,List<Integer>> graph , int src ,int dest , boolean []vis ,int n){
//         if(src==dest) return true;
        
//         vis[src] = true; 

//         for(int neibhour : graph.get(src) ){
//             if( !vis[neibhour] ){
//                 if( dfs( graph , neibhour , dest ,vis,n ) ) return true;
//             }
//         }
//         return false;
//     }
// }