// // 2816. Double a Number Represented as a Linked List


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
//     public ListNode doubleIt(ListNode head) {
//         head = rev(head);
//         int carry = 0;
//         ListNode temp=head;
//         while(temp!=null){
//             int v= temp.val*2 + carry;
//             if(v>=10){
//                 int a = v%10;
//                 temp.val = a;
//                 carry = v/10;
//             }
//             else{
//                 carry=0;
//                 temp.val = v;
//             }
//             temp=temp.next;
//         }
//         head=rev(head);
//         if(carry>0){
//             ListNode nn = new ListNode(carry);
//             nn.next=head;
//             head=nn;
//         }

//         return head;
//     }
//     ListNode rev(ListNode head){
//         if(head==null || head.next==null) return head;
//         ListNode nh = rev(head.next);
//         head.next.next = head;
//         head.next=null;
//         return nh;
//     }
// }