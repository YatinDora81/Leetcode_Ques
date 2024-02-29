// // 1609. Even Odd Tree

// class Solution {
//     public boolean isEvenOddTree(TreeNode root) {
//         Queue<TreeNode> q=new LinkedList<>();
//         q.add(root);
//         boolean even =true;
//         while(q.size()>0){
//             int n = q.size();
//             List<Integer> ll = new ArrayList<>();
//             for(int i=0  ;i<n;i++){
//                 TreeNode curr = q.remove();
//                 if(even==false && curr.val%2!=0) return false;
//                 if(even==true && curr.val%2==0) return false;
//                 ll.add(curr.val);
//                 if(curr.left!=null) q.add(curr.left);
//                 if(curr.right!=null) q.add(curr.right);
//             }
//             if(even==true){
//                 for(int i=0;i<ll.size()-1;i++){
//                     if(ll.get(i)>=ll.get(i+1)) return false;
//                 }
//             }
//             else{
//                 for(int i=0;i<ll.size()-1;i++){
//                     if(ll.get(i)<=ll.get(i+1)) return false;
//                 }
//             }
//             even = !even;
//         }
//         return true;
//     }
// }