// // 515. Find Largest Value in Each Tree Row

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
//     public List<Integer> largestValues(TreeNode root) {
        
//         Queue<TreeNode> q=new LinkedList<>();
//         List<Integer> ans=new ArrayList<>();
//         if(root==null) return ans;
//         q.add(root);
//         while(q.size()>0){
//             int s = q.size();
//             int maxi = Integer.MIN_VALUE;
//             for(int i=0;i<s;i++){
//                 TreeNode curr = q.remove();
//                 maxi = Math.max(maxi , curr.val);
//                 if(curr.left!=null) q.add(curr.left);
//                 if(curr.right!=null) q.add(curr.right);
//             }
//             ans.add(maxi);
            
//         }
//         return ans;

//     }
// }