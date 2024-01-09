// 2744. Find Maximum Number of String Pairs

class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        HashMap<String,Integer> map=new HashMap<>();
        
        for(String s : words){
            if(map.containsKey(s)){
                map.put(s,map.get(s)+1);
            }
            else{
                map.put(s,1);
            }
        }

        int ans=0;
        for(String s : words){
            StringBuilder sb=new StringBuilder(s);
            sb.reverse();
            if(s.equals(sb.toString())){
                if(map.get(s)>1) ans++;
                map.remove(s);
            }
            else if(map.containsKey(sb.toString())){
                map.remove(s);
                ans++;
            }
        }
        return ans;
    }
}