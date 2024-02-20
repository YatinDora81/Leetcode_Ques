// 824. Goat Latin

class Solution {
    public String toGoatLatin(String sentence) {
        String []arr=sentence.trim().split(" ");
        StringBuilder sb=new StringBuilder("maa");
        for(int i=0;i<arr.length;i++){
            String s =arr[i];
            if(!vowel(s.charAt(0))){
                arr[i]= s.substring(1) + s.charAt(0) + sb.toString();
                sb.append("a"); 
            }
            else{
                arr[i]+= sb.toString();
                sb.append("a"); 
            }
        }
        sb=new StringBuilder();
        for(int i=0;i<arr.length;i++){
            sb.append(arr[i] + " ");
        }
        return sb.toString().trim();
    }

    public static boolean vowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}