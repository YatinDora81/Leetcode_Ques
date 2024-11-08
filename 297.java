// // 297. Serialize and Deserialize Binary Tree

// /**
//  * Definition for a binary tree node.
//  * public class TreeNode {
//  *     int val;
//  *     TreeNode left;
//  *     TreeNode right;
//  *     TreeNode(int x) { val = x; }
//  * }
//  */
// public class Codec {

//     // Encodes a tree to a single string.
//     public String serialize(TreeNode root) {
//         StringBuilder sb = new StringBuilder();
//         Queue<TreeNode> q = new LinkedList<>();
//         q.add(root);

//         while(q.size()>0){
//             TreeNode t = q.remove();
//             if(t==null) sb.append("1111,");
//             else sb.append( t.val + "," );

//             if( t!=null ){
//                 q.add(t.left);
//                 q.add(t.right);
//             }
//         }

//         if(sb.length()>0) sb.deleteCharAt(sb.length()-1);
//         // System.out.println(sb);

//         return sb.toString();
//     }

//     // Decodes your encoded data to tree.
//     public TreeNode deserialize(String data) {
//         String o[] = data.split(",");
//         int arr[] = new int[o.length];
//         for(int i=0;i<arr.length;i++) arr[i] = Integer.parseInt(o[i]);
//         // HashSet<Integer> set = new HashSet<>();
//         // System.out.println(Arrays.toString(arr));
//         TreeNode root = makeTree( arr );
//         return root;
//     }

//     public TreeNode makeTree(int []arr ){
//         if(arr.length==0 || arr[0]==1111) return null;
        
//         int i = 1;
//         Queue<TreeNode> q = new LinkedList<>();
//         TreeNode root = new TreeNode(arr[0]);
//         q.add( root );

//         while(i<arr.length){
//             if(q.size()==0) break;
//             TreeNode t = q.remove();

//             if( i<arr.length && arr[i]!=1111 ){
//                 t.left = new TreeNode( arr[i] );
//                 q.add( t.left ); 
//             }
//             if( i+1<arr.length && arr[i+1]!=1111 ){
//                 t.right = new TreeNode( arr[i+1] );
//                 q.add( t.right ); 
//             }
//             i+=2;
//         }

//         return root;

        
//     }
// }

// // Your Codec object will be instantiated and called as such:
// // Codec ser = new Codec();
// // Codec deser = new Codec();
// // TreeNode ans = deser.deserialize(ser.serialize(root));