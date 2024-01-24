// 1636. Sort Array by Increasing Frequency

/* 
class Solution {
    public int[] frequencySort(int[] arr) {
        
        List<Integer> ls=new ArrayList<>();
        for(int i : arr){
            ls.add(i);
        }

        List<Integer> temp=sortkro(ls);

        int ans[]=new int[temp.size()];
        for(int i=0;i<temp.size();i++){
            ans[i]=temp.get(i);
        }
        return ans;
        

    }
    public static List<Integer> sortkro(List<Integer> ls){
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i : ls){
            map.put(i,map.getOrDefault(i, 0)+1);
        }

        Collections.sort(ls,(n1,n2)->{
            int freq1=map.get(n1);
            int freq2=map.get(n2);

            if(freq1!=freq2) return freq1-freq2;//desending order
            return n2-n1;//ascending order
            // return n2-n1;//descending order
        });

        return ls;
    }
}

*/