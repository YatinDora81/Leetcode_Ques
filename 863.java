// /**
//  * Definition for a binary tree node.
//  * public class TreeNode {
//  *     int val;
//  *     TreeNode left;
//  *     TreeNode right;
//  *     TreeNode(int x) { val = x; }
//  * }
//  */
// class Solution {
//     public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
//         HashMap<TreeNode,TreeNode> par = new HashMap<>();
//         find(root,par);

//         HashSet<TreeNode> vis = new HashSet<>();
//         Queue<TreeNode> q = new LinkedList<>();
//         vis.add(target);
//         q.add(target);
//         List<Integer> ll = new ArrayList<>();
//         int lvl = 0;
//         if(k==0){
//             ll.add(target.val);
//             return ll;
//         }

//         while(q.size()>0){
//             int n = q.size();
//             lvl++;
//             for(int i=0;i<n;i++){
//                 TreeNode t = q.remove();
//                 if(t.left!=null && !vis.contains(t.left)){
//                     if(lvl==k) ll.add(t.left.val);
//                     vis.add(t.left);
//                     q.add(t.left);
//                 }
//                 if(t.right!=null && !vis.contains(t.right)){
//                     if(lvl==k) ll.add(t.right.val);
//                     vis.add(t.right);
//                     q.add(t.right);
//                 }
//                 if(par.get(t)!=null && !vis.contains(par.get(t))){
//                     if(lvl==k) ll.add(par.get(t).val);
//                     vis.add(par.get(t));
//                     q.add(par.get(t));
//                 }
//             }
//             if(lvl==k) break;
//         }
//         return ll;
//     }

//     public void find(TreeNode root , HashMap<TreeNode,TreeNode> par){
//         if(root==null || (root.left==null && root.right==null)) return;
//         if(root.left!=null) par.put(root.left,root);
//         if(root.right!=null) par.put(root.right,root);
//         find(root.left,par);
//         find(root.right,par);
//     }
// }