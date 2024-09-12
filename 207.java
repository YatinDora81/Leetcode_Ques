// // 207. Course Schedule

// class Solution {
//     public boolean canFinish(int numCourses, int[][] prerequisites) {
//         List<Integer> graph[] = new List[numCourses];
//         for(int i=0;i<numCourses;i++) graph[i] = new ArrayList<>();
//         for(int []pre : prerequisites){
//             int u = pre[1] , v = pre[0];
//             graph[u].add(v);
//         }
//         Queue<Integer> q = new LinkedList<>();
//         List<Integer> ll = new ArrayList<>();

//         int ind[] = new int[numCourses];
//         for(int i=0;i<graph.length;i++){
//             for(int j=0;j<graph[i].size();j++){
//                 ind[ graph[i].get(j) ] += 1;
//             }
//         }

//         for(int i=0;i<ind.length;i++){
//             if(ind[i]==0){
//                 q.add(i);
//                 ll.add(i);
//             }
//         }

//         while(q.size()>0){
//             int curr = q.remove();
//             for(int nei : graph[curr]){
//                 ind[nei] -= 1;
//                 if(ind[nei]==0){
//                     q.add(nei);
//                     ll.add(nei);
//                 }
//             }
//         }

//         System.out.print(ll);
//         return ll.size() == numCourses;
//     }

// }