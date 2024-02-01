// // 450. Delete Node in a BST
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
//     public static int successor(TreeNode root){
//         int ans=root.val;
//         while(root.left!=null){
//             ans=root.left.val;
//             root=root.left;
//         }
//         return ans;
//     }
//     public TreeNode deleteNode(TreeNode root, int key) {
//         if(root==null) return null;
//         if(root.val>key) root.left= deleteNode(root.left,key);
//         else if(root.val<key) root.right= deleteNode(root.right,key);
//         else{
//             if(root.left==null) return root.right;
//             else if(root.right==null) return root.left;
            
//             root.val= successor(root.right);
//             root.right = deleteNode(root.right,root.val);
//         }
//         return root;
//     }
// }