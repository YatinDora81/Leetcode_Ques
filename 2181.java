// // 2181. Merge Nodes in Between Zeros

// class Solution {
//     public ListNode mergeNodes(ListNode head) {
//         ListNode nh = new ListNode(-1);
//         ListNode tail = nh;

//         int c =0 ;
//         head = head.next;
//         while(head!=null){
//             if(head.val==0){
//                 ListNode nn = new ListNode(c);
//                 tail.next = nn;
//                 tail = nn;
//                 c=0;
//             }
//             else c+=head.val;
//             head=head.next;
//         }

//         return nh.next;
//     }

//     void add(ListNode tail,int v){
//         ListNode nn = new ListNode(v);
//         tail.next = nn;
//         tail = nn;
//     }
// }