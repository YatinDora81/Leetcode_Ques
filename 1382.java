// // 1382. Balance a Binary Search Tree

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
//     public TreeNode balanceBST(TreeNode root) {
//         if(checkBalance(root)) return root;

//         List<Integer> ll = new ArrayList<>();
//         inorder(root,ll);

//         System.out.print(ll);

//         return makeTree(ll,0,ll.size()-1);

//     }

//     TreeNode makeTree(List<Integer> ll , int s, int e){
//         if(s>e) return null;
//         if(s==e) return new TreeNode(ll.get(s));

//         int mid = (s+e)/2;

//         TreeNode root = new TreeNode(ll.get(mid));

//         root.left = makeTree(ll , s , mid-1);
//         root.right = makeTree(ll , mid+1 , e);

//         return root;
//     }

//     void inorder(TreeNode root, List<Integer> ll){
//         if(root==null) return;
//         inorder(root.left,ll);
//         ll.add(root.val);
//         inorder(root.right,ll);
//     }

//     boolean checkBalance(TreeNode root){
//         if( (root==null) || (root.left==null && root.right==null) ) return true;

//         int l = height(root.left);
//         int r = height(root.right);

//         if(Math.abs(l-r)>1) return false;
//         return checkBalance(root.left) && checkBalance(root.right);
//     }

//     int height(TreeNode root){
//         if(root==null) return 0;
//         return 1 + Math.max( height(root.left) , height(root.right) );
//     }
// }