// 917. Reverse Only Letters


class Solution {
    public String reverseOnlyLetters(String s) {
        char []arr =  s.toCharArray();
        int i=0,j=arr.length-1;
        while(i<j){
            while(i<arr.length && is(arr[i]) ) i++;
            while(j>=0 && i<j && is(arr[j]) ) j--;
            if(i>=j || i>=arr.length || j<0) break;
            char t = arr[i];
            arr[i]=arr[j];
            arr[j]=t;
            i++;
            j--;
        }
        StringBuilder sb=new StringBuilder();
        for(char ch : arr) sb.append(ch);
        return sb.toString();
    }
    boolean is(char ch){
        return !( (ch>='a' && ch<='z') || ch>='A' && ch<='Z' );
    }
}