// 819. Most Common Word
class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        HashMap<String ,Integer> map=new HashMap<>();
        StringBuilder sb=new StringBuilder(paragraph);
        removekr(sb);
        String arr[]=sb.toString().toLowerCase().split(" ");
        for(String s : arr){
            if(s.length()>0){
                if(map.containsKey(s)){
                map.put(s,map.get(s)+1);
            }
            else{
                map.put(s,1);
            }
            }
        }
        System.out.print(map);
        
        for(int i=0;i<banned.length;i++){
            if(map.containsKey(banned[i])) map.remove(banned[i]);
        }
        int maxi=-1;
        StringBuilder finall=new StringBuilder();

        for(String s: map.keySet()){
            if(map.get(s)>=maxi){
                maxi=map.get(s);
                finall=new StringBuilder(s);
            }
        }

        return finall.toString();
    }

    public boolean is(char ch){
        return (ch>='a' && ch<='z') || (ch>='A' && ch<='Z');
    }

    public void removekr(StringBuilder sb){
        for(int i=0;i<sb.length();i++){
            if(!is(sb.charAt(i)) && sb.charAt(i) != ' ') sb.setCharAt(i,' ');
        }
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)==' '){
                if(i>0 && sb.charAt(i-1) !=' ') continue;
            }
            else if(!is(sb.charAt(i))){
                if(i>0 && !is(sb.charAt(i-1))) continue;
                sb.delete(i,i+1);
            } 
            else if(is(sb.charAt(i))) continue;
            else sb.delete(i,i+1);
        }
    }

}