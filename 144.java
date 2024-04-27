// // 144. Binary Tree Preorder Traversal
// class Solution {
//     public List<Integer> preorderTraversal(TreeNode root) {
//         List<Integer> ll = new ArrayList<>();
//         tell(root,ll);
//         return ll;
//     }
//     void tell(TreeNode root,List<Integer> ll){
//         if(root==null) return;
//         ll.add(root.val);
//         tell(root.left,ll);
//         tell(root.right,ll);
//     }
// }