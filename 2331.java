// // 2331. Evaluate Boolean Binary Tree

// class Solution {
//     public boolean evaluateTree(TreeNode root) {
//         if(root.left==null && root.right==null && root.val==1) return true;
//         if(root.left==null && root.right==null && root.val==0) return false;
//         if( root.val==2 ) return evaluateTree(root.left) || evaluateTree(root.right);
//         return evaluateTree(root.left) && evaluateTree(root.right);
//     }
// }