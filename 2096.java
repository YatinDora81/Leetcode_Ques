// // 2096. Step-By-Step Directions From a Binary Tree Node to Another

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
//     public String getDirections(TreeNode root, int startValue, int destValue) {
//         StringBuilder s = new StringBuilder();
//         StringBuilder d = new StringBuilder();
        
//         tell(root,startValue,s);
//         tell(root,destValue,d);

//         s.reverse();
//         d.reverse();

//         while(s.length()>0 && d.length()>0 && s.charAt(0)==d.charAt(0)){
//             s.deleteCharAt(0);
//             d.deleteCharAt(0);
//         }

//         return "U".repeat(s.length()) + d.toString();

//     }

//     boolean tell(TreeNode root , int v , StringBuilder sb){
//         if(root==null) return false;
//         if(root.val == v) return true;
//         if(root.left!=null && tell(root.left,v,sb)){
//             sb.append("L");
//             return true;
//         }
//         if(root.right!=null && tell(root.right,v ,sb)){
//             sb.append("R");
//             return true;
//         }
//         return false;
//     }
// }