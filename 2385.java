// 2385. Amount of Time for Binary Tree to Be Infected
class Solution {
    public int amountOfTime(TreeNode root, int start) {
        //1. Finding Node
        TreeNode node=getNode(root,start);
        
        //2.child-parent mapping
        HashMap<TreeNode,TreeNode> p=new HashMap<>();
        mapParent(root,p);

        //3. making visited map with infected value and queue also for bfs
        HashMap<TreeNode,Integer> v=new HashMap<>();
        Queue<TreeNode> q=new LinkedList<>();

        q.add(node);
        v.put(node,0);

        while(q.size()>0){
            TreeNode temp=q.remove();
            int level = v.get(temp);
            //check left child
            if(temp.left!=null && !v.containsKey(temp.left)){
                v.put(temp.left,level+1);
                q.add(temp.left);
            }
            //check for right child
            if(temp.right!=null && !v.containsKey(temp.right)){
                v.put(temp.right,level+1);
                q.add(temp.right);
            }
            //check for parent
            if(p.containsKey(temp) && !v.containsKey(p.get(temp)) ){
                v.put(p.get(temp),level+1);
                q.add(p.get(temp));
            }
        }

        int maxi=-1;
        for(int i : v.values()){
            maxi=Math.max(maxi , i);
        }
        return maxi;


    }

    public void mapParent(TreeNode root,HashMap<TreeNode,TreeNode> p){
        if(root==null) return;
        if(root.left!=null) p.put(root.left,root);
        if(root.right!=null) p.put(root.right,root);

        mapParent(root.left,p);
        mapParent(root.right,p);
    }

    public TreeNode getNode(TreeNode root, int start){
        if(root==null) return null;
        if(root.val==start) return root;
        TreeNode l=getNode(root.left,start);
        TreeNode r=getNode(root.right,start);
        if(l==null) return r;
        return l;
    }
}