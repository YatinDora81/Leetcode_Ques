// // 703. Kth Largest Element in a Stream

// class KthLargest {
//     List<Integer> ll;
//     int k;
//     public KthLargest(int K, int[] nums) {
//         ll = new ArrayList<>();
//         for(int i : nums) ll.add(i);
//         k = K;
//     }
    
//     public int add(int val) {
//         ll.add(val);
//         Collections.sort(ll);
//         return ll.get(ll.size()-k);
//     }
// }