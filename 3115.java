// // 3115. Maximum Prime Difference

// class Solution {
//     public int maximumPrimeDifference(int[] nums) {
//         int maxi = 0;
//         for(int i : nums) maxi=Math.max(maxi,i);
//         boolean isprime[] = new boolean[maxi+1];
//         Arrays.fill(isprime,true);
//         checkPrime(isprime); //sieve of erathones
//         int s=0;
//         int e=0;
//         for(int i=0;i<nums.length;i++){
//             if(nums[i]>1 && isprime[nums[i]]){
//                 s=i;
//                 break;
//             }
//         }

//         for(int i=nums.length-1;i>=0;i--){
//             if(nums[i]>1 && isprime[nums[i]]){
//                 e=i;
//                 break;
//             }
//         }
//         return e-s;    
//     }

//     void checkPrime(boolean []prime){
//         for(int i=2;i<prime.length;i++){
//             if(prime[i]){
//                 for(int j = i*2 ; j<prime.length;j+=i){
//                     prime[j] = false;
//                 }
//             }
//         }
//     }

// }