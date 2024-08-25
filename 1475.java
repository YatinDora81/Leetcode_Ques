// // 1475. Final Prices With a Special Discount in a Shop

// class Solution {
//     public int[] finalPrices(int[] arr) {
//         int ans[] = new int[arr.length];
//         ans[ans.length-1] = arr[arr.length-1];
//         Stack<Integer> st = new Stack<>();
//         st.push(arr[arr.length-1]);
//         for(int i = arr.length -2 ; i>=0 ; i--){
//             while(st.size()>0 && arr[i]<st.peek()) st.pop();
//             if(st.size()!=0) ans[i] = arr[i] - st.peek();
//             else ans[i] = arr[i];
//             st.push(arr[i]);
//         }
//         return ans;
//     }
// }