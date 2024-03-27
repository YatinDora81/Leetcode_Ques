// // 145. Binary Tree Postorder Traversal

// class Solution {
//     public List<Integer> ans=new ArrayList<>();
//     public List<Integer> postorderTraversal(TreeNode root) {
//         p(root);
//         return ans;
//     }
//     public void p(TreeNode root){
//         if(root==null) return ;
//         p(root.left);
//         p(root.right);
//         ans.add(root.val);
//     }
// }