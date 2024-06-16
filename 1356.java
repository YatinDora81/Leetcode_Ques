// // 1356. Sort Integers by The Number of 1 Bits

// class Solution {
//     public class pair{
//         int a;
//         int b;
//         pair(int a, int b){
//             this.a=a;
//             this.b=b;
//         }
//     }
//     public int[] sortByBits(int[] nums) {
        
//         pair[] arr = new pair[nums.length];

//         for(int i=0;i<nums.length;i++){
//             arr[i] = new pair( nums[i] , Integer.bitCount( nums[i] ) );
//         }

//         Arrays.sort( arr , ( c,d )->{
//             if(c.b<d.b) return -1;
//             else if(c.b>d.b) return 1;
//             else{
//                 if(c.a<d.a) return -1;
//                 else if(c.a>d.a) return 1;
//                 else return 0;
//             }
//         } );

//         int ans[] = new int[nums.length];

//         for(int i=0;i<nums.length;i++){
//             ans[i] = arr[i].a;
//         }
//         return ans;
//     }
// }