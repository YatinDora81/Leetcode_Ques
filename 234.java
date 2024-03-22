// // 234. Palindrome Linked List
// class Solution {
//     public boolean isPalindrome(ListNode head) {
//         if(head.next==null) return true;
//         if(head.next.next==null) return head.val==head.next.val;
//         ListNode slow = head;
//         ListNode fast = head;
//         while(fast!=null && fast.next!=null && fast.next.next!=null){
//             slow=slow.next;
//             fast=fast.next.next;
//         }

//         fast = reverseLL(slow.next);
//         slow=head;
//         while(fast!=null){
//             if(slow.val!=fast.val) return false;
//             slow=slow.next;
//             fast=fast.next;
//         }

//         return true;
//     }

//     ListNode reverseLL(ListNode head){
//         if(head==null || head.next==null) return head;
//         ListNode n = reverseLL(head.next);
//         head.next.next=head;
//         head.next=null;
//         return n;
//     }
// }