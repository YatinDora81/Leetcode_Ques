// 1323. Maximum 69 Number

class Solution {
    public int maximum69Number (int num) {
        char arr[] = (num+"").toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[i] == '6') {
                arr[i] = '9';
                break;
            }
        }
        StringBuilder sb = new StringBuilder("");
        for(char s : arr) sb.append(s);
        return Integer.parseInt(sb.toString());
    }
}