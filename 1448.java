// // 1448. Count Good Nodes in Binary Tree

// class Solution {
//     public int goodNodes(TreeNode root) {
//         int arr[]={0};
//         tell(root,root.val,arr);
//         return arr[0];
//     }
//     void tell(TreeNode root,int i,int arr[]){
//         if(root==null) return ;
//         if(root.val>=i){
//             arr[0]++;
//             i=root.val;
//         }
//         tell(root.left,i,arr);
//         tell(root.right,i,arr);
//     }
// }