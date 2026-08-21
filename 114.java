// // // 114. Flatten Binary Tree to Linked List

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
//     public void flatten(TreeNode root) {
//         if(root==null) return;
//         if(root.left!=null){
//             TreeNode r = root.right;
//             TreeNode t = root;
//             root.right = root.left;
//             root.left = null;
//             while(t.right!=null)t = t.right;
//             t.right = r;   
//         }
//         flatten(root.right);
//     }
// }