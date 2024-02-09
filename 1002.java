// 1002. Find Common Characters

import java.util.*;

class Solution {
    public List<String> commonChars(String[] words) {
        List<String> ans=new ArrayList<>();

        if(words.length==1){
            for(char ch : words[0].toCharArray()){
                ans.add(ch+"");
            }
            return ans;
        }

        String temp= tellsame( words[0] , words[1] );

        for(int i=2;i<words.length;i++){
            temp = tellsame( temp,words[i] );
        }

        for(char ch : temp.toCharArray()){
                ans.add(ch+"");
        }
        
        return ans;
    }

    public String tellsame(String s1,String s2){
        List<String> ll=new ArrayList<>();
        HashMap<Character,Integer> m1=new HashMap<>();
        HashMap<Character,Integer> m2=new HashMap<>();

        for(char ch : s1.toCharArray()){
            if(m1.containsKey(ch)) m1.put(ch ,m1.get(ch)+1);
            else m1.put(ch,1);
        }
        for(char ch : s2.toCharArray()){
            if(m2.containsKey(ch)) m2.put(ch ,m2.get(ch)+1);
            else m2.put(ch,1);
        }

        for(char ch : m1.keySet()){
            if( m2.containsKey(ch) ){
                int c1=m1.get(ch);
                int c2=m2.get(ch);
                int n=(c1<c2) ? c1 : c2 ;
                for(int i=0;i< n;i++ ){
                    ll.add(ch+"");
                }
            }
        }

        String ans="";
        for(String s : ll) ans+=s;
        return ans;
    }
}