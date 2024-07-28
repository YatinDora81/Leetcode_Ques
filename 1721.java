// // 1721. Swapping Nodes in a Linked List

// class Solution {
//     public ListNode swapNodes(ListNode head, int k) {
//         HashMap<Integer,ListNode> map = new HashMap<>();
//         ListNode temp=  head;
//         int c=1;
//         while(temp!=null){
//             map.put(c, temp);
//             c++;
//             temp=temp.next;
//         }
//         if(map.size()<=1) return head;
//         int t = map.get(k).val;
//         map.get(k).val = map.get(map.size()-k+1).val;
//         map.get(map.size()-k+1).val = t;
//         return head;
//     }
// }