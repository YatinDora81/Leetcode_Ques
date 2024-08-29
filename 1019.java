// // 1019. Next Greater Node In Linked List

// /**
//  * Definition for singly-linked list.
//  * public class ListNode {
//  *     int val;
//  *     ListNode next;
//  *     ListNode() {}
//  *     ListNode(int val) { this.val = val; }
//  *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//  * }
//  */
// class Solution {
//     public int[] nextLargerNodes(ListNode head) {
//         List<Integer> ll = new LinkedList<>();
//         ListNode temp = head;
//         while(temp!=null){
//             ll.add(temp.val);
//             temp = temp.next;
//         }
//         int ans[] = new int[ll.size()];
//         Stack<Integer> st = new Stack<>();
//         for(int i=ll.size()-1;i>=0;i--){
//             if(st.size()==0) ans[i] = 0;
//             else if( ll.get(i)<st.peek() ) ans[i] =st.peek();
//             else{
//                 while(st.size()>0 && ll.get(i)>=st.peek()) st.pop();
//                 if(st.size()==0) ans[i] = 0;
//                 else ans[i] = st.peek();
//             }
//             st.push(ll.get(i));
//         }
//         return ans;
//     }
// }