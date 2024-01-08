// 938. Range Sum of BST

class Solution {
    public int rangeSumBST(TreeNode root, int low, int high) {
        int ans[]={0};
        tell(root,  low, high,ans);
        return ans[0];
    }
    public void tell(TreeNode root, int low, int high,int ans[]){
        if(root==null) return;
        if(root.val>=low && root.val<=high) ans[0]=ans[0]+root.val;
        tell(root.left,low,high,ans);
        tell(root.right,low,high,ans);
    }

}