// // 988. Smallest String Starting From Leaf

// class Solution {
//     public String smallestFromLeaf(TreeNode root) {
//         String s="";
//         List<String> ll=new ArrayList<>();
//         tell(root,s,ll);
//         Collections.sort(ll);
//         System.out.print(ll);
//         if(ll.size()==0) return "";
//         return ll.get(0);
//     }
//     void tell(TreeNode root, String s,List<String> ll){
//         if(root==null) return;
//         if(root.left==null && root.right==null){
//             StringBuilder sb=new StringBuilder(s+(char)(root.val+97));
//             ll.add(sb.reverse().toString());
//             return;
//         }
//         tell(root.left,s+(char)(root.val+97),ll);
//         tell(root.right,s+(char)(root.val+97),ll);
//     }
// }