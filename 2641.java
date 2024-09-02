// // 2641. Cousins in Binary Tree II

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
//     public TreeNode replaceValueInTree(TreeNode root) {
//         Queue<TreeNode> q = new LinkedList<>();
//         HashMap<TreeNode,TreeNode> map = new HashMap<>();
//         root.val = 0;
//         pre(root,map);
//         q.add(root);
//         List<List<TreeNode>> ans = new ArrayList<>();
//         while(q.size()>0){
//             int n = q.size();
//             List<TreeNode> ll = new ArrayList<>();
//             for(int i=0;i<n;i++){
//                 TreeNode t = q.remove();
//                 ll.add(t);
//                 if(t.left!=null) q.add(t.left);
//                 if(t.right!=null) q.add(t.right);
//             }
//             ans.add(ll);
//         }

//         for(int i=1;i<ans.size();i++){
//             List<Integer> ll = new ArrayList<>();
//             int tot = 0;
//             for(int j=0;j<ans.get(i).size();j++){
//                 tot += ans.get(i).get(j).val;
//             }
//             for(int j=0;j<ans.get(i).size();j++){
//                 TreeNode par = map.get( ans.get(i).get(j) );
//                 int c = 0;
//                 if(par.left!=null) c+= par.left.val;
//                 if(par.right!=null) c+= par.right.val;
                
//                 ll.add(tot - c);
//             }

//             for(int j=0;j<ans.get(i).size();j++){
//                 ans.get(i).get(j).val = ll.get(j);
//             }
//         }

        

//         return root;
//     }

//     int sum(TreeNode par , HashMap<TreeNode, TreeNode> map , List<TreeNode> ll){
//         int s = 0;
    
//         for(TreeNode t : ll){
//             if(map.get(t)!=par){
//                 s+= t.val;
//                 // System.out.print( t.val + " " );
//             }
//         }
//         return s;
//     }

//     void pre(TreeNode root , HashMap<TreeNode,TreeNode> map){
//         if(root==null) return;
//         if(root.left!=null) map.put(root.left , root);
//         if(root.right!=null) map.put(root.right , root);
//         pre(root.left , map);
//         pre(root.right , map);
//     }
// }