// // 19. Remove Nth Node From End of List

// class Solution {
//     public ListNode removeNthFromEnd(ListNode head, int n) {
//         if(head.next==null) return null;
//         ListNode nhead = new ListNode();
//         nhead.next = head;
//         ListNode slow = nhead;
//         ListNode fast = nhead;
//         for(int i=0;i<n;i++) fast=fast.next;

//         while(fast.next!=null){
//             fast=fast.next;
//             slow=slow.next;
//         }
//         // if()
//         slow.next=slow.next.next;
//         return nhead.next;
//     }
// }