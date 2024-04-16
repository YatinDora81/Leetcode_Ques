// // 623. Add One Row to Tree
// class Solution {
//     public TreeNode addOneRow(TreeNode root, int val, int depth) {
//         TreeNode r = new TreeNode(0);
//         r.left=root;
//         make(r,val,depth,0);
//         return r.left;
//     }
//     void make(TreeNode root,int val , int d,int i){
//         if(root!=null && i+1==d){
//             if(root.left!=null){
//                 TreeNode temp1 = new TreeNode(val);
//                 TreeNode rl = root.left;
//                 root.left = temp1;
//                 root.left.left = rl;
//             }
//             else root.left=new TreeNode(val);
//             if(root.right!=null){
//                 TreeNode temp2 = new TreeNode(val);
//                 TreeNode rr = root.right;
//                 root.right = temp2;
//                 root.right.right = rr;
//             }
//             else root.right=new TreeNode(val);
//             return ;
//         }
//         if(root==null) return;

//         make(root.left,val,d,i+1);
//         make(root.right,val,d,i+1);
//     }
// }