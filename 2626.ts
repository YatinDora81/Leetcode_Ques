// // 2626. Array Reduce Transformation

// type Fn = (accum: number, curr: number) => number

// function reduce(nums: number[], fn: Fn, init: number): number {
//     let ans :  number = init;
//     for(let i=0;i<nums.length;i++){
//         ans = fn( ans , nums[i] )
//     }
//     return ans;
// };