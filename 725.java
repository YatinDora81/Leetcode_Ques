// // 725. Split Linked List in Parts

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
//     public ListNode[] splitListToParts(ListNode head, int k) {
//         ListNode []arr = new ListNode[k];
//         // for(int i=0;i<k;i++) arr[i] 
//         int n = 0;
//         ListNode temp = head;
//         while( temp!=null ){
//             n++;
//             temp = temp.next;
//         }
//         int rem = n%k;
//         int div = n / k;
//         temp = head;
//         for(int i=0;i<k;i++){
//             int d = div;
//             if(rem>0){
//                 d++;
//                 rem--;
//             }
//             ListNode nh = new ListNode(-1);
//             ListNode nt = nh;
//             while( d!=0 && temp!=null ){
//                 nt.next = new ListNode(temp.val);
//                 temp = temp.next;
//                 nt = nt.next;
//                 d--;
//             }

//             arr[i] = nh.next;
            
//         }

//         return arr;
//     }
// }