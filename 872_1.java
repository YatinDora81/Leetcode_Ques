// // 872. Leaf-Similar Trees

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
//     public boolean leafSimilar(TreeNode root1, TreeNode root2) {
//         List<Integer> ll1 = new ArrayList<>();
//         List<Integer> ll2 = new ArrayList<>();

//         helpp(root1,ll1);
//         helpp(root2,ll2);

//         return ll1.equals(ll2);
//     }
//     void helpp(TreeNode root , List<Integer> ll){
//         if(root==null) return;
//         if(root.left==null && root.right==null) ll.add(root.val);
//         helpp(root.left,ll);
//         helpp(root.right,ll);
//     }
// }