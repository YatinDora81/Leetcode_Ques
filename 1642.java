// 1642. Furthest Building You Can Reach


import java.util.*;
class Solution {
    public int furthestBuilding(int[] arr, int bricks, int ladders) {
        //my code
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        int bricksused=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]<arr[i]){
                if(pq.size()<ladders){
                    pq.add(arr[i]-arr[i-1]);
                }
                else{
                    if(pq.size()>0 && pq.peek()< arr[i]-arr[i-1]){
                        bricksused += pq.remove();
                        pq.add(arr[i]-arr[i-1]);
                        if(bricksused> bricks) return i-1;
                    }
                    else{
                        bricksused += arr[i]-arr[i-1];
                        if(bricksused > bricks) return i-1;
                    }
                }
            }
        }
        return arr.length-1;

        // return tell(arr,bricks,ladders);
    }

    private static int tell(int[] arr, int bricks, int ladders) {
        //video
        int n=arr.length;
        PriorityQueue<Integer> pq=new PriorityQueue<>();

        int brickused=0;

        for(int i=1;i<n;i++){

            int diff=arr[i]-arr[i-1];

            if(diff>0){
                pq.add(diff);
                if(pq.size()>ladders){
                    brickused+=pq.remove();
                }
                if(brickused>bricks){
                    return i-1;
                }
            }
        }
        return n-1;
    }
}