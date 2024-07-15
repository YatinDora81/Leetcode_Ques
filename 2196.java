// // 2196. Create Binary Tree From Descriptions

// /**
//  * Definition for a binary tree node.
//  * public class TreeNode {
//  *     int val;
//  *     TreeNode left;
//  *     TreeNode right;
//  *     TreeNode() {}
//  *     TreeNode(int val) { this.val = val; }
//  *     TreeNode(int val, TreeNode left, TreeNode right) {
//  *         this.val = val;
//  *         this.left = left;
//  *         this.right = right;
//  *     }
//  * }
//  */
// class Solution {
//     public TreeNode createBinaryTree(int[][] descriptions) {
//         HashMap<Integer,TreeNode> map = new HashMap<>();
//         HashSet<Integer> set = new HashSet<>();
//         for(int arr[] : descriptions){
//             int p = arr[0];
//             int c = arr[1];
//             set.add(c);
//             if(!map.containsKey(p) && !map.containsKey(c)){
//                 TreeNode np = new TreeNode(p);
//                 TreeNode nc = new TreeNode(c);
//                 map.put(p,np);
//                 map.put(c,nc);
//                 if( arr[2]==1 ) np.left = nc;
//                 else np.right = nc;
//             }
//             else if(!map.containsKey(p) || !map.containsKey(c)){
//                 TreeNode np , nc ;
//                 if(map.containsKey(p)){
//                     np = map.get(p);
//                     nc = new TreeNode(c);
//                 }
//                 else{
//                     np = new TreeNode(p);
//                     nc = map.get(c);
//                 }
//                 if(!map.containsKey(np)) map.put(p,np);
//                 if(!map.containsKey(nc)) map.put(c,nc);
//                 if( arr[2]==1 ) np.left = nc;
//                 else np.right = nc;
//             }
//             else{
//                 TreeNode np = map.get(p);
//                 TreeNode nc = map.get(c);
//                 set.add(c);
//                 if( arr[2]==1 ) np.left = nc;
//                 else np.right = nc;
//             }
//         }
//         for(int i[] : descriptions){
//             if(!set.contains(i[0])) return map.get(i[0]);
//         }
//         return null ;
//     }
// }