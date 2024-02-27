// // 543. Diameter of Binary Tree


// class Solution {
//     int height(TreeNode root){
//         if(root==null || (root.left==null && root.right==null)) return 0;
//         return 1 + Math.max(height(root.left) , height(root.right));
//     }
//     public int diameterOfBinaryTree(TreeNode root) {
//         if(root==null) return 0;
//         int l = height(root.left);
//         if(root.left!=null) l++;
//         int r =height(root.right);
//         if(root.right!=null) r++;

//         return Math.max(l+r , Math.max(diameterOfBinaryTree(root.left),diameterOfBinaryTree(root.right)));
//     }
// }