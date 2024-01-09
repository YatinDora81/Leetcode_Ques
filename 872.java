// 872. Leaf-Similar Trees
class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> arr1=new ArrayList<>();
        List<Integer> arr2=new ArrayList<>();
        tell(root1,arr1);
        tell(root2,arr2);
        return arr1.equals(arr2);
    }
    public void tell(TreeNode root,List<Integer> arr){
        if(root==null) return;
        if(root.left==null && root.right==null){
            arr.add(root.val);
            return;
        }
        tell(root.left,arr);
        tell(root.right,arr);
    }
}