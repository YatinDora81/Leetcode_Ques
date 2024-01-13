// // 988. Smallest String Starting From Leaf

// class Solution {
//     public String smallestFromLeaf(TreeNode root) {
//         List<String> ll=new ArrayList<>();
//         tell(root,ll,""); 
//         Collections.sort(ll);
//         return (ll.size()==0) ? "" : ll.get(0);
//     }
//     public void tell(TreeNode root,List<String> ll,String s){
//         if(root==null){
//             return;
//         }
//         if(root.left==null && root.right==null){
//             s+=(char)(97+root.val);
//             StringBuilder sb=new StringBuilder(s);
//             ll.add(sb.reverse().toString());
//             return;
//         }

//         tell(root.left,ll,s+ (char)(97+root.val) );
//         tell(root.right,ll,s+ (char)(97+root.val) );

//     }
// }