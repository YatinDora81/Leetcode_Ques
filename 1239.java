// 1239. Maximum Length of a Concatenated String with Unique Characters

/*

class Solution {
    public int maxLength(List<String> arr) {
        return tell(0,arr,"");
    }

    public int tell(int ind,List<String> arr,String s){
        if(ind==arr.size()) return s.length();
        int maxi=0;
        for(int i=ind;i<arr.size();i++){
            if( isunique(s,arr.get(i)) ) maxi=Math.max(maxi,tell(i+1,arr,s+arr.get(i)));
            else maxi=Math.max(maxi,tell(i+1,arr,s));
        }
        return maxi;
    }

    public boolean isunique(String s1,String s2){
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<s1.length();i++){
            if(set.contains(s1.charAt(i))) return false;
            set.add(s1.charAt(i));
        }
        for(int i=0;i<s2.length();i++){
            if(set.contains(s2.charAt(i))) return false;
            set.add(s2.charAt(i));
        }
        return true;
    }
}

*/