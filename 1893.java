// // 1893. Check if All the Integers in a Range Are Covered

// class Solution {
//     public boolean isCovered(int[][] ranges, int left, int right) {
//         HashSet<Integer> set = new HashSet<>();
//         for(int arr[] : ranges) for(int i=arr[0];i<=arr[1];i++) set.add(i);
//         for(int i=left;i<=right;i++) if(!set.contains(i)) return false;
//         return true;
//     }
// }