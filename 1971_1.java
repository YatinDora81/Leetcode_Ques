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
//         return dfs(graph,source,destination,n,vis);
//     }
//     boolean dfs(Map<Integer,List<Integer>> graph,int src,int dest,int n,boolean vis[]){
//         if(src==dest) return true;

//         vis[src]= true;
//         for(int i=0;i<graph.get(src).size();i++){
//             int ss = graph.get(src).get(i);
//             if(!vis[ss]){
//                 if(dfs(graph,ss,dest,n,vis)) return true;
//             }
//         }
//         return false;
//     }
// }