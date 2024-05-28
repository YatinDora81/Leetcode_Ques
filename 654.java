// // 654. Maximum Binary Tree

// class Solution {
//     public TreeNode constructMaximumBinaryTree(int[] nums) {
//         return make( nums , 0 , nums.length-1 );
//     }

//     TreeNode make( int nums[] , int s , int e ){
//         if(s>e) return null;
//         if(s==e) return new TreeNode( nums[s] );

//         int ind = s;
//         int maxi = nums[s];

//         for(int i = s ; i<=e ; i++){
//             if(nums[i]>maxi){
//                 maxi = nums[i];
//                 ind = i;
//             }
//         }

//         int mid = ind;
//         TreeNode root=new TreeNode(nums[mid]);
//         root.left = make(nums , s , mid-1);
//         root.right = make(nums,mid+1,e);

//         return root;
//     }
// }