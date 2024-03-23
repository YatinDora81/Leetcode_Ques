// // 143. Reorder List

// class Solution {
//     public void reorderList(ListNode head) {
//         if(head==null || head.next==null || head.next.next==null) return ;
//         ListNode slow = head;
//         ListNode fast = head;
//         while(fast!=null && fast.next!=null && fast.next.next!=null){
//             slow=slow.next;
//             fast=fast.next.next;
//         }
//         Stack<ListNode> st = new Stack<>();
//         fast = slow;
//         slow=slow.next;
//         fast.next = null;
//         while(slow!=null){
//             st.add(slow);
//             slow=slow.next;
//         }

//         ListNode temp = head;
//         ListNode forw = temp.next;
//         while(temp!=null && forw!=null){
//             forw = temp.next;
//             if(st.size()==0){
//                 temp.next = forw;
//                 return ;
//             }
//             temp.next=st.pop();
//             temp=temp.next;
//             temp.next = forw;
//             temp=temp.next; 
//         }   
//     }
// }