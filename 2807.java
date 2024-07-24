// // 2807. Insert Greatest Common Divisors in Linked List

// class Solution {
//     public ListNode insertGreatestCommonDivisors(ListNode head) {
//         ListNode temp = head;
//         while(temp!=null && temp.next!=null){
//             int v = gcd(temp.val , temp.next.val);
//             ListNode nn = new ListNode(v);
//             ListNode t = temp.next;
//             temp.next = nn;
//             nn.next=t;
//             temp = t;
//         }
//         return head;
//     }

//     int gcd(int a,int b){
//         int ans=1;
//         for(int i=Math.min(a,b);i>=1;i--) if(a%i==0 && b%i==0) return i;
//         return ans;
//     }
// }