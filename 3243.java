// // 3243. Shortest Distance After Road Addition Queries I

// class Solution {
//     public int[] shortestDistanceAfterQueries(int n, int[][] queries) {
//         int ans[] = new int[queries.length];
//         List<Integer> [] graph = new List[n];
//         for(int i=0;i<n;i++) graph[i] = new ArrayList<>();
//         for(int i=0;i<n-1;i++) graph[i].add(i+1);
        

//         for(int i=0;i<ans.length ; i++){
//             int u = queries[i][0] , v = queries[i][1];
//             graph[u].add(v);
//             ans[i] = tell(graph , n-1);
//         }

//         // System.out.println(Arrays.toString(graph));
//         return ans;
//     }

//     public int tell(List<Integer> []graph , int dest){
//         Queue<Integer> q = new LinkedList<>();
//         q.add(0);
//         boolean vis[] = new boolean[graph.length];
//         vis[0] = true;
//         int ans = 0;
//         while(q.size()>0){
//             int n = q.size();

//             for(int i=0;i<n;i++){
//                 int t = q.remove();
//                 if( t == dest ) return ans;
//                 for( int nei : graph[t] ){
//                     if(!vis[nei]){
//                         q.add(nei);
//                         vis[nei] = true;
//                     }
//                 }
//             }

//             ans++;
//         }
//         return ans;
//     }
// }