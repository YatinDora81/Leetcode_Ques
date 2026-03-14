// https://www.geeksforgeeks.org/problems/detect-cycle-in-an-undirected-graph/1

// class Solution {
//     public boolean isCycle(int n, int[][] edges) {
//         // Code here
        
//         HashMap<Integer,List<Integer>> map = new HashMap<>();
//         for(int e[] : edges){
//             int u = e[0] , v = e[1];
//             if(!map.containsKey(u)) map.put(u,new ArrayList<>());
//             if(!map.containsKey(v)) map.put(v,new ArrayList<>());
//             map.get(u).add(v);
//             map.get(v).add(u);
//         }
        
//         boolean vis[] = new boolean[n];
//         for(int i=0;i<vis.length;i++){
//             if(!vis[i]){
//                 Queue<Integer> q = new LinkedList<>();
//                 q.add(i);
//                 vis[i] = true;
//                 while(q.size()>0){
//                     int r = q.remove();
//                     if(!map.containsKey(r)) continue;
//                     for(int nei : map.get(r)){
//                         if(vis[nei]) return true;
//                         vis[nei] = true;
//                         q.add(nei);
//                     }
//                 }
//             }
//         }
//         return false;
//     }
// }