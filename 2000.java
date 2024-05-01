// 2000. Reverse Prefix of Word

class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder sb=new StringBuilder();
        boolean flag = false;
        for(char c : word.toCharArray()){
            if(flag==false && c==ch){
                sb.append(c);
                flag = true;
                sb.reverse();
                continue;
            }
            sb.append(c);
        }
        return sb.toString();
    }
}