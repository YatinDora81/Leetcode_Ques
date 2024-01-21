// 1859. Sorting the Sentence
/*
class Solution {
    public String sortSentence(String s) {
        String arr[]=s.split(" ");
        HashMap<Integer,String> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            String temp=arr[i];
            map.put( Integer.parseInt(""+temp.charAt(temp.length()-1))  , temp.substring(0,temp.length()-1));
        }
        System.out.print(map);
        StringBuilder sb=new StringBuilder();
        for(int i=1;i<=map.size();i++){
            sb.append(map.get(i));
            if(i!=map.size()) sb.append(" ");
        }
        return sb.toString();
    }
}
*/