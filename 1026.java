// 1026. Maximum Difference Between Node and Ancestor
class Solution {
    public int maxAncestorDiff(TreeNode root) {
        if(root==null) return 0;
        int ans[]={-1};
        tellmaxi(root,root.val,ans);
        return Math.max(ans[0] , Math.max( maxAncestorDiff(root.left) ,  maxAncestorDiff(root.right) ));
    }
    public void tellmaxi(TreeNode root,int v,int ans[]){
        if(root==null) return;
        if( Math.abs(v-root.val) > ans[0]){
            ans[0]=Math.abs(v-root.val);
        }
        tellmaxi(root.left,v,ans);
        tellmaxi(root.right,v,ans);
    }
}