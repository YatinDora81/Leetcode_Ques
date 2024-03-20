// // 1669. Merge In Between Linked Lists


// class Solution {
//     public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
//         ListNode tail2 =list2;
//         while(tail2.next!=null) tail2= tail2.next;
//         ListNode temp1 = list1;
//         ListNode temp2 = list1;
//         for(int i=0;i<a-1;i++) temp1=temp1.next;
//         for(int i=0;i<b;i++) temp2=temp2.next;
//         temp1.next = list2;
//         tail2.next = temp2.next;
//         return list1;
//     }
// }