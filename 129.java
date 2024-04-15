// // 129. Sum Root to Leaf Numbers

// class Solution {
//     public int sumNumbers(TreeNode root) {
//         return tell(root,"");
//     }

//     int tell(TreeNode root,String s){
//         if(root==null){
//             return 0;
//         }
//         if(root.left==null && root.right==null){
//             return Integer.parseInt(s+root.val);
//         }
//         int l=tell(root.left,s+root.val);
//         int r=tell(root.right,s+root.val);
//         return l+r;
//     }
// }