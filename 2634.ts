// // 2634. Filter Elements from Array

// type Fn = (n: number, i: number) => any

// function filter(arr: number[], fn: Fn): number[] {
//     let newarr  : number[] = [];
//     for(let i=0;i<arr.length;i++){
//         if( fn(arr[i] , i) ) newarr.push(arr[i]);
//     }
//     return newarr
// };