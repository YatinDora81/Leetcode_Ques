// // // 762. Prime Number of Set Bits in Binary Representation

// // class Solution {
// //     public int countPrimeSetBits(int left, int right) {
// //         int ans= 0;
// //         for(int i=left;i<=right;i++){
// //             if(isprime(Integer.bitCount(i))) ans++;
// //         }
// //         return ans;

// //     }

// //     boolean isprime(int n){
// //         if(n<2) return false;
// //         if(n==2 || n==3) return true;
// //         for(int i=2;i<=n/2;i++){
// //             if(n%i==0) return false;
// //         }
// //         return true;
// //     }
// // }




// class Solution {
//     public int countPrimeSetBits(int left, int right) {
//         int ans = 0;
//         HashMap<Integer,Boolean> map = new HashMap<>();
//         for(int i = left;i<=right;i++){
//            String s = Integer.toBinaryString(i);
//            int c = 0;
//            for(char ch : s.toCharArray()) if(ch=='1') c++;
//            if(isPrime(c,map)) ans++;
//         }
//         return ans;
//     }
//     public boolean isPrime(int n,HashMap<Integer,Boolean> dp){
//         if(n<=1) return false;
//         if(n<=3) return true;
//         if(dp.containsKey(n)) return dp.get(n);

//         for(int i=2;i*i<=n;i++){
//             if(n%i==0){
//                 dp.put(n,false);
//                 return false;
//             }
//         }
//         dp.put(n,true);
//         return true;
//     }   
// }