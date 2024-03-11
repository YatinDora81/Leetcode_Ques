// // 1367. Linked List in Binary Tree


// class Solution {
//     public boolean isSubPath(ListNode head, TreeNode root) {
//         if(root==null) return false;
//         if(issame(head,root)) return true;
//         return  isSubPath(head,root.left) || isSubPath(head,root.right);
//     }
//     boolean issame(ListNode head, TreeNode root){
//         if(head==null) return true;
//         if(root==null) return false;
//         if(head.val != root.val) return false;
//         return issame(head.next , root.left) || issame(head.next , root.right); 
//     }
// }