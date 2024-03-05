// // 671. Second Minimum Node In a Binary Tree


// class Solution {
//     public int findSecondMinimumValue(TreeNode root) {
//         HashSet<Integer> set=new HashSet<>();
//         pre(root,set);
//         List<Integer> ll =new ArrayList<>(set);
//         Collections.sort(ll);
//         if(ll.size()<=1) return -1;
//         return ll.get(1);
//     }
//     void pre(TreeNode root,HashSet<Integer> set){
//         if(root==null) return;
//         set.add(root.val);
//         pre(root.left,set);
//         pre(root.right,set);
//     }

// }