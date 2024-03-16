// // 508. Most Frequent Subtree Sum

// class Solution {
//     public int[] findFrequentTreeSum(TreeNode root) {
//         HashMap<Integer,Integer> map=new HashMap<>();
//         tellAllSum(root , map);


//         int maxifreq = 0;
//         for(int i : map.keySet()){
//             maxifreq = Math.max(maxifreq , map.get(i));
//         }
//         int noofele = 0;
//         for(int i : map.keySet()){
//             if(map.get(i)==maxifreq) noofele++;
//         }

//         int ans[]=new int[noofele];

//         int l =0 ;
//         for(int i : map.keySet()){
//             if(map.get(i)==maxifreq){
//                 ans[l++] = i;
//             }
//         }
//         return ans;
//     }

//     void tellAllSum(TreeNode root, HashMap<Integer,Integer> map){
//         if(root==null) return ;
//         int s = sum(root);
//         if(map.containsKey(s)) map.put(s,map.get(s)+1);
//         else map.put(s,1);
        
//         tellAllSum(root.left , map);
//         tellAllSum(root.right, map);
//     }

//     int sum(TreeNode root){
//         if(root==null) return 0;
//         if(root.left==null && root.right==null) return root.val;
//         return root.val + sum(root.left) + sum(root.right);
//     }
// }