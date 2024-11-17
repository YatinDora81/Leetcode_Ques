// // 2623. Memoize

// /**
//  * @param {Function} fn
//  * @return {Function}
//  */

// let callCount = 0; 
// function memoize(fn) {
//     let map = new Map()
//     return function(...args) {
//         if( map.has( args+"" ) ) return map.get( args+"" );
//         let ans = fn(...args)
//         map.set( args+"" , ans )
//         callCount++;
//         return ans;
//     }
// }


// /** 
//  * let callCount = 0;
//  * const memoizedFn = memoize(function (a, b) {
//  *	 callCount += 1;
//  *   return a + b;
//  * })
//  * memoizedFn(2, 3) // 5
//  * memoizedFn(2, 3) // 5
//  * console.log(callCount) // 1 
//  */