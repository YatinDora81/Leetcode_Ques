//2125 Number of Laser Beams in a Bank
//https://leetcode.com/problems/number-of-laser-beams-in-a-bank/description/?envType=daily-question&envId=2024-01-03

class Solution {
    public int numberOfBeams(String[] bank) {
        int ans=0;
        List<Integer> ll=new ArrayList<>();
        for(int i=0;i<bank.length;i++){
            String s=bank[i];
            int c=0;
            for(int j=0;j<s.length();j++){
                if(s.charAt(j)=='1') c++;
            }
            if(c!=0) ll.add(c);
        }

        System.out.print(ll);

        if(ll.size()<2) return 0;

        while(ll.size()!=1){
            ans=ans + (ll.get(0) * ll.get(1));
            ll.remove(0);
        }
        return ans;
    }
}