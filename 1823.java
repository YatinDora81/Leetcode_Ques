// // 1823. Find the Winner of the Circular Game

// class Solution {
//     public int findTheWinner(int n, int k) {
//         Queue<Integer> q = new LinkedList<>();
//         for(int i=1;i<=n;i++) q.add(i);
//         int i=1;
//         while(q.size()>1){
//             if(i%k==0) q.remove();
//             else  q.add(q.remove());
//             i++;
//         }
//         return q.peek();
//     }
// }