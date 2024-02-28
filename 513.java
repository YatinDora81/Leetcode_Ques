// // 513. Find Bottom Left Tree Value

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
//     int height(TreeNode root){
//         if(root==null) return 0;
//         return 1 + Math.max(height(root.left),height(root.right));
//     }
//     long tellans(TreeNode root,int h,int c){
//         if(root==null) return (long)1e14;
//         if(h==c) return root.val;
//         long l = tellans(root.left,h,c+1);
//         if(l!=(long)1e14) return l;
//         return tellans(root.right,h,c+1);
        
//     }
//     public int findBottomLeftValue(TreeNode root) {
//         int h = height(root);
//         return (int)tellans(root,h,1);
//     }
// }