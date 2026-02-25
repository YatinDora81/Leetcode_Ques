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
//     public int rob(TreeNode root) {
//         HashMap<String,Integer> dp = new HashMap<>();
//         return solve( root , true , dp);
//     }
//     public int solve(TreeNode root , boolean can , HashMap<String,Integer> dp){
//         if(root==null) return 0;
//         if(dp.containsKey(root+"-"+can)) return dp.get(root+"-"+can);
//         if(can){
//             int a = root.val + solve(root.left , !can,dp) + solve(root.right , !can,dp);
//             int b = solve(root.left , can,dp) + solve(root.right , can,dp);
//             int ans = Math.max(a,b);
//             dp.put(root+"-"+can,ans);
//             return ans;
//         }
//         else{
//             int ans = solve(root.left , !can,dp) + solve(root.right , !can,dp);
//             dp.put(root+"-"+can,ans);
//             return ans;
//         }
//     }
// }