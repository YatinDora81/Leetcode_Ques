// 451. Sort Characters By Frequency

import java.util.*;
class Solution {
    public String frequencySort(String s) {
        List<Character> arr=new ArrayList<>();
        for(char ch : s.trim().toCharArray()){
            arr.add(ch);
        }
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch : arr){
            if(map.containsKey(ch)) map.put(ch ,map.get(ch)+1);
            else map.put(ch,1);
        }

        Collections.sort(arr , (c1,c2)->{
            int freq1=map.get(c1);
            int freq2=map.get(c2);
            if(freq1<freq2) return 1;
            else if(freq1>freq2) return -1;
            else{
                if(c1<c2) return -1;
                else if(c1>c2) return 1;
                return 0;
            }
        } );

        StringBuilder sb=new StringBuilder();
        for(char ch : arr) sb.append(ch);
        return sb.toString();
    }
}