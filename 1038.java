// // 1038. Binary Search Tree to Greater Sum Tree

// class Solution {
//     public TreeNode bstToGst(TreeNode root) {
//         int arr[] ={0};
//         make(root,arr);
//         return root;
//     }
//     void make(TreeNode root, int []arr){
//         if(root==null) return;

//         make(root.right , arr );
//         arr[0] += root.val;
//         root.val = arr[0];
//         make(root.left,arr);
//     }
// }