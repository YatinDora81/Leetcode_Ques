// // // 967. Numbers With Same Consecutive Differences


// class Solution {

//     public int[] numsSameConsecDiff(int n, int k) {
//         //bfs code
//         List<Integer> ll=new ArrayList<>();
//         Queue<Integer> q=new LinkedList<>();

//         for(int num=1;num<=9;num++){ // no leading zeros
//             q.add(num);
//         }

//         int len=1; //level

//         while( q.size()>0 && len < n ){
//             len++;  // next level
//             int s=q.size();

//             for(int i=0;i<s;i++){ //with in level
//                 int currnum= q.remove();
//                 int lastDigit= currnum % 10;
//                 if( lastDigit + k <=9 ) q.add( currnum *10 + lastDigit + k );
//                 if( k!=0 && lastDigit - k >=0 ) q.add( currnum *10 + lastDigit - k ); // k!=0 because no duplicate need example if k==0
//             }
//         }

//         while(q.size()>0) ll.add(q.remove());

//         int ans[]=new int[ll.size()];
//         for(int i=0;i<ll.size();i++) ans[i]=ll.get(i);
//         return ans;
//     }
// }



// /*

//   // // dfs approach

// class Solution {

//     public void dfs(int num, int n, int k, List<Integer> ll){
//         if(n==0){
//             ll.add(num);
//             return ;
//         }

//         int lastDigit = num%10;

//         if( lastDigit + k <=9 ) dfs( num*10 + lastDigit +k , n-1,k,ll );
//         if( k!=0 && lastDigit - k >=0 ) dfs( num*10 + lastDigit - k , n-1,k,ll ); //if k==0 then duplicate values aa jaegi
//     }

//     public int[] numsSameConsecDiff(int n, int k) {
//         //dfs code
//         List<Integer> ll=new ArrayList<>();

//         for(int num=1;num<=9;num++){ // no leading zeros
//             dfs( num , n-1 ,k ,ll );
//         }

//         int ans[]=new int[ll.size()];
//         for(int i=0;i<ll.size();i++) ans[i]=ll.get(i);
//         return ans;
//     }
// }


// */