// // 1492. The kth Factor of n

// class Solution {
//     public int kthFactor(int n, int k) {
//         List<Integer> ll = new ArrayList<>();

//         for(int i=1;i<=n;i++){
//             if(ll.size()>=k) return ll.get( k-1 );
//             if( n%i==0 ) ll.add(i);
//         }

//         if(ll.size()>=k) return ll.get( k-1 );
//         return -1;
        
//     }
// }