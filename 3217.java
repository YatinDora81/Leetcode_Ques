// // 3217. Delete Nodes From Linked List Present in Array

// class Solution {
//     public ListNode modifiedList(int[] nums, ListNode head) {
//         HashSet<Integer> set = new HashSet<>();
//         for(int i : nums) set.add(i);
//         ListNode nh = new ListNode(-1111);
//         nh.next = head;
//         ListNode temp = nh;
//         while(temp.next!=null){
//             if(set.contains(temp.next.val)){
//                 temp.next = temp.next.next;
//             }
//             else temp=temp.next;
//         }
//         return nh.next;
//     }
// }