// 994. Rotting Oranges

import java.util.*;

class Solution {

    public class Node{
        int time;
        int i;
        int j;
        Node(int i,int j,int t){
            this.i=i;
            this.j=j;
            this.time=t;
        }
    }

    public int orangesRotting(int[][] arr) {
        
        //1. checking if 1 or fresh orange is present or nit
        boolean ispresent=false;
        for(int i=0;i<arr.length;i++ ){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==1) ispresent=true;
            }
        }

        if(ispresent==false) return 0;


        Queue<Node> q=new LinkedList<>();

        //2. adding node into queue which have value 2 or fresh orange    
        for(int i=0;i<arr.length;i++) for(int j=0;j<arr[0].length;j++) if(arr[i][j]==2) q.add(new Node(i,j,0));
        int ans=-1;
        
        //3. bfs
        while(q.size()>0){
            Node removed=q.remove();
            int i = removed.i;
            int j = removed.j;
            int val=removed.time;
            ans=val;
            if( i-1>=0 && arr[i-1][j]==1){//upper
                q.add(new Node(i-1,j,val+1));
                arr[i-1][j]=2;
            }
            if(j-1>=0 && arr[i][j-1]==1){//left
                arr[i][j-1]=2;
                q.add(new Node(i,j-1,val+1));
            }
            if(i+1< arr.length && arr[i+1][j]==1){//down
                arr[i+1][j]=2;
                q.add(new Node(i+1,j,val+1));
            }
            if(j+1< arr[0].length && arr[i][j+1]==1){//right
                arr[i][j+1]=2;
                q.add(new Node(i,j+1,val+1));
            }
        }
        
        //4. chech if all fresh orange are rotten or not
        for(int i=0;i<arr.length;i++ ){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==1) return -1;
            }
        }

        return ans;
    }
}