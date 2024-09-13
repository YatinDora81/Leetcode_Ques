// // 3169. Count Days Without Meetings

// class Solution {
//     public int countDays(int days, int[][] arr) {
//         Arrays.sort(arr , (a,b)->{
//             if(a[0]-b[0]<0) return -1;
//             else if(a[0]-b[0]>0) return 1;
//             else{
//                 if(a[1]-b[1]<0) return -1;
//                 else if(a[1]-b[1]>0) return 1;
//                 return 0;
//             }
//         });
//         List<List<Integer>> ans = new ArrayList<>();
//         List<Integer> ll = new ArrayList<>();

//         ll.add( arr[0][0] );
//         ll.add( arr[0][1] );

//         ans.add(ll);

//         for(int i=1;i<arr.length;i++){
//             ll = new ArrayList<>();
//             if( arr[i][0] <= ans.get(ans.size()-1).get(1) ){
//                 // merge
//                 int x = Math.min( arr[i][0] , ans.get(ans.size()-1).get(0) );
//                 int y = Math.max( arr[i][1] , ans.get(ans.size()-1).get(1) );
//                 ans.remove(ans.size()-1);
//                 ll.add(x);
//                 ll.add(y);
//             }
//             else{
//                 ll.add(arr[i][0]);
//                 ll.add(arr[i][1]);
//             }
//             ans.add(ll);
//         }
        
//         for( List<Integer> ds : ans ){
//             days -= ds.get(1) - ds.get(0) + 1;
//         }
//         return days;
//     }
// }