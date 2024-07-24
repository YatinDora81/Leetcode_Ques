// // 2415. Reverse Odd Levels of Binary Tree

// class Solution {
//     public TreeNode reverseOddLevels(TreeNode root) {
//         if(root==null || (root.left==null && root.right==null) ) return root;
//         Queue<TreeNode> q =  new LinkedList<>();
//         q.add(root);
//         boolean f= false;
//         while(q.size()>0){
//             int n = q.size();
//             List<TreeNode> ll = new ArrayList<>();
//             for(int i=0;i<n;i++){
//                 TreeNode temp = q.remove();
//                 ll.add(temp);
//                 if(temp.left!=null){
//                     q.add(temp.left);
//                     q.add(temp.right);
//                 }
//             }
//             if(f){
//                 List<Integer> ds = new ArrayList<>();
//                 for(TreeNode t : ll) ds.add(t.val);
//                 Collections.reverse(ds);
//                 for(int i=0;i<ll.size();i++){
//                     ll.get(i).val = ds.get(i);
//                 }
//             }
//             f=!f;
//         }

//         return root;
//     }
// }