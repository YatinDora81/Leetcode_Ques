// 2085. Count Common Words With One Occurrence

/*
class Solution {
    public int countWords(String[] words1, String[] words2) {
        HashMap<String,Integer> map1=new HashMap<>();
        HashMap<String,Integer> map2=new HashMap<>();
        make(words1,map1);
        make(words2,map2);
        int c=0;
        for(String s : map1.keySet()) if(map1.get(s)==1 && map2.containsKey(s) && map2.get(s)==1 ) c++;
        return c;
    }
    public void make(String []arr , HashMap<String,Integer> map){
        for(String s : arr){
            if(map.containsKey(s)) map.put(s,map.get(s)+1);
            else map.put(s,1);
        }
    }
}
*/