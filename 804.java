// 804. Unique Morse Code Words

class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String []arr={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashSet<String> set=new HashSet<>();
        for(int i=0;i<words.length;i++){
            StringBuilder sb=new StringBuilder();
            String s=words[i];
            for(int j=0;j<s.length();j++){
                sb.append(arr[s.charAt(j) - 'a']);
            }
            set.add(sb.toString());
        }
        return set.size();
    }
}