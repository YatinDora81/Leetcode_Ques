// // 2058. Find the Minimum and Maximum Number of Nodes Between Critical Points

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
//     public int[] nodesBetweenCriticalPoints(ListNode head) {
//         List<Integer> ll = new ArrayList<>();
//         ListNode n1 = head;
//         ListNode n2 = head.next;
//         int c=2;
//         while( n2!=null && n2.next!=null ){
//             if( n2.val<n1.val && n2.val<n2.next.val ) ll.add(c);
//             else if(n2.val>n1.val && n2.val>n2.next.val) ll.add(c);
//             c++;
//             n1=n1.next;
//             n2=n2.next;
//         }

//         int ans[] = {-1,-1};
//         if(ll.size()>1){
//             Collections.sort(ll);
//             int mini = 1111111;
//             for(int i=1;i<ll.size();i++){
//                 mini = Math.min(mini,ll.get(i)-ll.get(i-1));
//             }
//             ans[0] = mini;
//             ans[1] = ll.get(ll.size()-1) - ll.get(0);
//         }


//         return ans;
//     }
// }