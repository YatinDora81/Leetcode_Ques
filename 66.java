// // 66. Plus One

// class Solution {
//     public int[] plusOne(int[] digits) {
//         List<Integer> ll = new ArrayList<>();
//         for(int i=digits.length-1 ; i>=0 ; i--) ll.add(digits[i]);

//         int carry = 1;

//         for(int i=0;i<ll.size();i++){
//             int curr = ll.get(i) + carry;
//             ll.set( i , curr%10 );
//             carry = curr /10;

//         }
//         if(carry!=0){
//             ll.add(carry);
//         }

//         Collections.reverse(ll);

//         int ans[] = new int[ll.size()];
//         for(int i=0;i<ll.size();i++){
//             ans[i] = ll.get(i);
//         }
//         return ans;
//     }
// }