// 1436. Destination City
/*
class Solution {
    public String destCity(List<List<String>> paths) {
        HashMap<String,String> map=new HashMap<>();
        for(int i=0;i<paths.size();i++) map.put(paths.get(i).get(0) , paths.get(i).get(1) );
        String s=paths.get(0).get(0);
        while(true){
            if( !map.containsKey(s) ) break;
            s=new String(map.get(s));
        }
        return s;
    }
} 
*/