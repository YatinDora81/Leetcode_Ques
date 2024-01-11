//gfg
// Vertical Traversal of Binary Tree
import java.util.*;


class Solution
{
    //Function to find the vertical order traversal of Binary Tree.
    static ArrayList <Integer> verticalOrder(Node root)
    {
        // add your code here
        ArrayList<Integer> ans = new ArrayList<>();

        if (root == null)
            return ans;

        Queue<Map.Entry<Node, Integer>> q = new ArrayDeque<>();

        int col = 0;
        int min = 0;
        int max = 0;

        Map<Integer, ArrayList<Integer>> map = new HashMap<>();

        q.add(new AbstractMap.SimpleEntry<>(root, col));

        while (q.size() > 0) {
            Map.Entry<Node, Integer> removed = q.remove();

            int level = removed.getValue();
            Node node = removed.getKey();

            if (node != null) {
                if (!map.containsKey(level)) {
                    map.put(level, new ArrayList<>());
                }
                map.get(level).add(node.data);
                
                min=Math.min(min,level);
                max=Math.max(max,level);

                q.add(new AbstractMap.SimpleEntry<>(node.left,level-1));
                q.add(new AbstractMap.SimpleEntry<>(node.right,level+1));

            }

        }

        for(int i=min;i<=max;i++){
            ArrayList<Integer> temp=map.get(i);
            for(int j=0;j<temp.size();j++){
                ans.add(temp.get(j));
            }
        }

        return ans;
    }
}