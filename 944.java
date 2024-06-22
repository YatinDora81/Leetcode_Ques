// 944. Delete Columns to Make Sorted

class Solution {
    public int minDeletionSize(String[] arr) {
        int c=0;
        for(int i=0;i<arr[0].length();i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j].charAt(i) > arr[j+1].charAt(i) ){
                    c++;
                    break;
                }
            }
        }
        return c;
    }
}