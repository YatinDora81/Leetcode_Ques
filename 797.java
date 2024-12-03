// // 797. All Paths From Source to Target

// class Solution {
//     public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
//         List<List<Integer>> ans = new ArrayList<>();
        
//         tell( graph , 0  ,new ArrayList<>() , ans );

//         return ans;
//     }

//     public void tell(int [][]graph , int curr , List<Integer> ll , List<List<Integer>> ans){
//         if( curr == graph.length-1 ){
//             ll.add( curr );
//             ans.add(new ArrayList<>(ll));
//             ll.remove( ll.size()-1 );
//             return;
//         }

//         ll.add( curr );
//         for(int nei : graph[curr]){
//             tell( graph , nei , ll , ans );
//         }
//         ll.remove(ll.size()-1);
//     }
// }