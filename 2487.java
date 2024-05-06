// // 2487. Remove Nodes From Linked List

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
//     public ListNode removeNodes(ListNode head) {
//         Stack<ListNode> st=new Stack<>();
//         ListNode curr = head;

//         while(curr!=null){
            
//             while(st.size()>0 && curr.val>st.peek().val) st.pop();

//             st.push(curr);
//             curr = curr.next;
//         }
//         Stack<ListNode> st2=new Stack<>();
//         while(st.size()>0) st2.push(st.pop());
//         ListNode nh = new ListNode(0);
//         curr = nh;
//         while(st2.size()>0){
//             if(st2.size()==1) st2.peek().next=null;
//             curr.next = st2.pop();
//             curr = curr.next;
//         }

//         return nh.next;

//     }
// }