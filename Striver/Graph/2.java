// https://www.geeksforgeeks.org/problems/connected-components-in-an-undirected-graph/1

// class Solution {
//     public ArrayList<ArrayList<Integer>> getComponents(int V, int[][] edges) {
//         // code here
//         HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();
//         for(int e[] : edges){
//             int u = e[0] , v = e[1];
//             if(!map.containsKey(u)) map.put(u,new ArrayList<>());
//             if(!map.containsKey(v)) map.put(v,new ArrayList<>());
//             map.get(u).add(v);
//             map.get(v).add(u);
//         }
//         boolean vis[] = new boolean[V];
//         ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        
//         for(int i =0 ;i<vis.length;i++){
//             if(!vis[i]){
//                 Queue<Integer> q = new LinkedList<>();
//                 q.add(i);
//                 vis[i] = true;
//                 ArrayList<Integer> ll = new ArrayList<>();
//                 while(q.size()>0){
//                    int t = q.remove();
//                    ll.add(t);
//                    if(!map.containsKey(t)) continue;
//                    for(int nei : map.get(t)){
//                        if(!vis[nei]){
//                            q.add(nei);
//                            vis[nei] = true;
//                        }
//                    }
//                 }
//                 ans.add(ll);
//             }
//         }
//         return ans;
//     }
// }