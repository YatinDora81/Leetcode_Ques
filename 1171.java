// // 1171. Remove Zero Sum Consecutive Nodes from Linked List

// class Solution {
//     public ListNode removeZeroSumSublists(ListNode head) {
//         if (head == null || (head.next == null && head.val == 0))
//             return null;
//         if (head.next == null)
//             return head;

//         ListNode sen = new ListNode(-1111);
//         sen.next = head;

//         ListNode i = sen;
//         while (i != null) {
//             ListNode j = i.next;
//             int sum = 0;
//             while (j != null) {
//                 sum += j.val;

//                 if (sum == 0) {
//                     // i.next=j.next;
//                     break;
//                 }

//                 j = j.next;
//             }

//             if (j != null) {
//                 i.next = j.next;
//             } else {

//                 i = i.next;
//             }

//         }
//         // if(i==null) return null;
//         return sen.next;

//     }
// }