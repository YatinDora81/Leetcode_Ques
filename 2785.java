// 2785. Sort Vowels in a String

class Solution {
    public String sortVowels(String s) {
        List<Character> ll=new ArrayList<>();
        StringBuilder sb=new StringBuilder(s);
        for(int i=0;i<sb.length();i++){
            if(is(sb.charAt(i))){
                ll.add(sb.charAt(i));
                sb.setCharAt(i,' ');
            }

        }
        Collections.sort(ll);
        if(ll.size()>0){
            for(int i=0;i<sb.length();i++){
                if(sb.charAt(i)==' '){
                    sb.setCharAt(i,ll.remove(0));
                }
            }
        }
        return sb.toString();
    }
    public boolean is(char ch){
        return (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U');
    }
}