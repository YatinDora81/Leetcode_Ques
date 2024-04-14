// // 404. Sum of Left Leaves

// class Solution {
//     public int sumOfLeftLeaves(TreeNode root) {
//         int ans[]={0};
//         tell(root,ans);
//         return ans[0];
//     }
//     void tell(TreeNode root,int arr[]){
//         if(root==null) return;
//         if(root.left!=null && root.left.left==null && root.left.right==null) arr[0]+=root.left.val;
//         tell(root.left,arr);
//         tell(root.right,arr);
//     }
// }