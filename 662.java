// // 662. Maximum Width of Binary Tree


// class Solution {
//     class pair{
//         TreeNode node;
//         int i;
//         pair(TreeNode node,int i){
//             this.node=node;
//             this.i=i;
//         }
//     }
//     public int widthOfBinaryTree(TreeNode root) {
//         Queue<pair> q=new LinkedList<>();
//         q.add(new pair(root,0));
//         int ans = -1;
//         while(q.size()>0){
//             int n = q.size();
//             int minind = q.peek().i;  // here we are finding minimum ind so that next level always start from 1 
            
//             int l=0; // it is used for storing the index for first node index of each level
//             int r=0; // it is used for storing the index for last node index of each level
//             for(int i=0;i<n;i++){
//                 pair p = q.remove();
//                 if(i==0) l=p.i;
//                 if(i==n-1) r=p.i;
// // here we are subtract minind which we calculate before so that next level always start from 1 and we know the formula for left node 2*(level)+1 for left and +2 for right
//                 if(p.node.left!=null) q.add(new pair(p.node.left,2*(p.i-minind)+1));
//                 if(p.node.right!=null) q.add(new pair(p.node.right,2*(p.i-minind)+2));
//             }
//             // for cal node between the formula is r-l+1
//             ans = Math.max(ans,r-l+1);
//         }
//         return ans;
//     }
// }