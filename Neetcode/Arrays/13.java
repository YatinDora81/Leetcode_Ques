package Arrays;
// class Solution {
//     public class Node{
//         int num;
//         int freq;
//         Node(int num,int freq){
//             this.num = num;
//             this.freq = freq;
//         }
//     }
//     public int[] topKFrequent(int[] nums, int k) {
//         int ans[] = new int[k];
//         HashMap<Integer,Integer> map = new HashMap<>();
//         for(int i  : nums){
//             if(!map.containsKey(i)) map.put(i,0);
//             map.put(i,map.get(i)+1);
//         }
//         PriorityQueue<Node> pq  = new PriorityQueue<>((a,b)->{
//             if(a.freq-b.freq>0) return -1;
//             else if(a.freq-b.freq<0) return 1;
//             return 0;
//         });
//         for(int i : map.keySet()){
//             pq.add(new Node(i,map.get(i)));
//         }

//         System.out.println(pq);
//         for(int i=0;i<k;i++) ans[i] = pq.remove().num;

//         return ans;

        
//     }
// }
