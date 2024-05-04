// 2833. Furthest Point From Origin

class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int a=0 , c=0;
        for(char ch : moves.toCharArray()){
            if(ch=='L') a++;
            else if(ch=='R') a--;
            else c++;
        }
        return Math.abs(a) + c;
    }
}