// // 2074. Reverse Nodes in Even Length Groups

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
//     public ListNode reverseEvenLengthGroups(ListNode head) {
//         List<ListNode> ll = new ArrayList<>();
//         ListNode temp = head;
//         int l = 1;
//         while(temp!=null){
//             int c = 1;
//             ll.add(temp);

//             while( c<l && temp!=null ){
//                 c++;
//                 temp = temp.next;
//             }
//             if(temp==null) break;
//             ListNode t = temp.next;
//             temp.next = null;
//             temp = t;
//             l++;
//         }

//         List<Integer> num = new ArrayList<>();

//         for(int i=0;i<ll.size();i++){
//             ListNode t = ll.get(i);
//             int c= 0;
//             while(t!=null){
//                 t = t.next;
//                 c++;
//             }
//             num.add( c );
//         }

//         for(int i=0;i<num.size();i++){
//             if(num.get(i)%2==0){
//                 reverse(ll , i);
//             }
//         }

//         for(int i=0;i<ll.size()-1;i++){
//             ListNode t = ll.get(i);
//             while(t.next!=null){
//                 t = t.next;
//             }
//             t.next = ll.get(i+1);
//         }
//         // System.out.println(num);
//         return ll.get(0);
//     }

//     void reverse(List<ListNode> ll , int ind){
//         ListNode head = ll.get(ind);
//         if(head!=null && head.next==null) return ;
//         ListNode curr = head;
//         ListNode prev = null;
//         ListNode after = null;
//         while(curr!=null){
//             after = curr.next;
//             curr.next = prev;
//             prev = curr;
//             curr = after;
//         }

//         ll.set( ind  , prev);
//     }
// }