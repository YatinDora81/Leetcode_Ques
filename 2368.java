// // 2368. Reachable Nodes With Restrictions

// class Solution {
//     public int reachableNodes(int n, int[][] edges, int[] restricted) {
//         List<Integer> graph[] = new List[n];
//         for(int i=0;i<n;i++) graph[i] = new ArrayList<>();
//         for(int[] edge : edges){
//             graph[ edge[0] ].add(edge[1]);
//             graph[ edge[1] ].add(edge[0]);
//         }

//         System.out.println(Arrays.toString(graph));
//         HashSet<Integer> set = new HashSet<>();
//         for(int i : restricted) set.add(i); //restricted
//         boolean vis[] = new boolean[n];
//         int ans[] = {0};
        
//         // dfs( 0 , graph , vis , set , ans );
//         bfs( graph , vis , set , ans );

//         return ans[0];
//     }

//     public void bfs( List<Integer> graph[]  , boolean vis[] , HashSet<Integer> set , int []ans ){
//         Queue<Integer> q = new LinkedList<>();
//         q.add(0);
//         vis[0] = true;
//         ans[0]+=1;
//         while(q.size()>0){
//             int curr = q.remove();
//             for( int nei : graph[curr] ){
//                 if( !vis[nei] && !set.contains(nei) ){
//                     q.add(nei);
//                     vis[nei] = true;
//                     ans[0]+=1;
//                 }
//             }
//         }
//     }

//     public void dfs(int curr , List<Integer> graph[]  , boolean vis[] , HashSet<Integer> set , int []ans){
//         if(vis[curr]) return;
//         vis[curr] = true;
//         ans[0]+=1;

//         for( int nei : graph[curr] ){
//             if( !vis[nei] && !set.contains(nei) ){
//                 dfs( nei , graph , vis , set , ans );
//             }
//         }
//     }
// }