// 49. Group Anagrams

import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans=new ArrayList<>();
        HashMap<String ,List<String> > map=new HashMap<>();
        for(int i=0 ;i<strs.length;i++){
            char arr[]=strs[i].toCharArray();
            Arrays.sort(arr);
            StringBuilder sb=new StringBuilder();
            for(char s : arr){
                sb.append(s+"");
            }

            if(map.containsKey(sb.toString())){
                map.get(sb.toString()).add(strs[i]);
                // map.put(sb.toString() , map.get(sb.toString()).add(strs[i]));
            }
            else{
                map.put(sb.toString() , new ArrayList<>());
                map.get(sb.toString()).add(strs[i]);
            }
        }

        for(List<String> ll : map.values()){
            ans.add(ll);
        }
        return ans;

    }
}