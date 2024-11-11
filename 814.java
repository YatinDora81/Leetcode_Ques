// // 814. Binary Tree Pruning

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
//     public TreeNode pruneTree(TreeNode root) {
//         TreeNode h = new TreeNode(1);
//         h.left = root;
//         del(h);
//         return h.left;
//     }
//     public void del(TreeNode root){
//         if(root==null) return;
//         if(root.left!=null && root.left.val==0){
//             boolean is = check(root.left);
//             if(!is) root.left = null;
//         }
//         if(root.right!=null && root.right.val==0){
//             boolean is = check(root.right);
//             if(!is) root.right = null;
//         }

//         del(root.left);
//         del(root.right);
        
//     }

//     public boolean check(TreeNode root){
//         if(root==null) return false;
//         if(root.val==1) return true;
//         return check( root.left ) || check( root.right );
//     }
// }