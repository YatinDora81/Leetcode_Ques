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
//     public int sumRootToLeaf(TreeNode root) {
//         List<String> ll = new ArrayList<>();
//         solve(root,ll,"");
//         int ans = 0;
//         for(String s : ll) ans = ans + Integer.parseInt(s,2);
//         System.out.println(ll);
//         return ans;
//     }
//     public void solve(TreeNode root , List<String> ll, String s){
//         if(root==null) return ;
//         if(root.left==null && root.right==null){
//             ll.add(s+root.val);
//             return;
//         }
//         solve(root.left , ll , s+root.val);
//         solve(root.right , ll , s+root.val);

//     }
// }