// 2325. Decode the Message

/* 
class Solution {
    public String decodeMessage(String s, String m) {
        HashMap<Character,Character> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.size()==26) break;
            if(s.charAt(i)!=' ' && !map.containsKey(s.charAt(i))) map.put(s.charAt(i) , (char)('a'+ map.size()));
        }
        
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<m.length();i++){
            if(m.charAt(i)!=' ') sb.append(map.get(m.charAt(i)));
            else sb.append(' ');
        }
        return sb.toString();
    }
}
*/