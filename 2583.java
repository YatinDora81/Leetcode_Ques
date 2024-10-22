// // 2583. Kth Largest Sum in a Binary Tree

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
//     public long kthLargestLevelSum(TreeNode root, int k) {
//         PriorityQueue<Long> pq = new PriorityQueue<>();
//         Queue<TreeNode> q = new LinkedList<>();
//         q.add(root);
//         while( q.size()>0 ){
//             int n = q.size();
//             long c = 0;
//             for(int i=0;i<n;i++){
//                 TreeNode temp = q.remove();
//                 c+= temp.val;
//                 if(temp.left!=null) q.add(temp.left);
//                 if(temp.right!=null) q.add(temp.right);
//             }
//             if( pq.size()!=k ) pq.add(c);
//             else if( pq.peek() < c  ){
//                 pq.remove();
//                 pq.add(c);
//             }
//         }
//         if(pq.size()<k) return -1;
//         return pq.peek();
//     }
// }