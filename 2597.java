// // 2597. The Number of Beautiful Subsets

// class Solution {
//     public int beautifulSubsets(int[] nums, int k) {
//         List<Integer> ll=new ArrayList<>();
//         return tell( 0, nums , k ,ll);
//     }

//     boolean is(List<Integer> ll,int k){
//         if(ll.size()==0) return false;
        
//         for(int i=0;i<ll.size();i++){
//             for(int j=0;j<ll.size();j++){
//                 if(i==j) continue;
//                 else if( Math.abs(ll.get(i)-ll.get(j)) == k ) return false;
//             }
//         }
//         return true;
//     }

//     int tell(int ind,int nums[] , int k , List<Integer> ll){
//         if(ind==nums.length){
//             if( is(ll,k) ){
//                 //  System.out.print(ll);
//                  return 1;
//             }
//             return 0;
//         }

//         ll.add(nums[ind]);
//         int a = tell(ind+1,nums,k,ll);
//         ll.remove(ll.size()-1);
//         int b= tell(ind+1,nums,k,ll);

//         return a+b;
//     }
// }