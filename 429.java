// // 429. N-ary Tree Level Order Traversal

// /*
// // Definition for a Node.
// class Node {
//     public int val;
//     public List<Node> children;

//     public Node() {}

//     public Node(int _val) {
//         val = _val;
//     }

//     public Node(int _val, List<Node> _children) {
//         val = _val;
//         children = _children;
//     }
// };
// */

// class Solution {
//     public List<List<Integer>> levelOrder(Node root) {
//         List<List<Integer>> ans = new ArrayList<>();
//         Queue<Node> q = new LinkedList<>();
//         if(root==null) return ans;
//         q.add(root);

//         while(q.size()>0){
//             int n = q.size();
//             List<Integer> ll = new ArrayList<>();
//             for(int i=0;i<n;i++){
//                 Node t = q.remove();
//                 ll.add(t.val);
//                 for(Node node : t.children) q.add(node);
//             }
//             ans.add(ll);
//         }

//         return ans;
//     }
// }