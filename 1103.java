// 1103. Distribute Candies to People

class Solution {
    public int[] distributeCandies(int candy, int n) {
        int arr[]=new int[n];
        int i=0;
        int c=1;
        while( candy>0 ){
            if(c<=candy){
                arr[i%n]+=c;
                candy=candy-c;
                c++;
            }
            else if(candy<c){
                arr[i%n]+=candy;
                break;
            }
            i++;
        }

        return arr;
    }
}