// // 506. Relative Ranks

// class Solution {
//     public static class pair {
//         int f;
//         int s;
//         pair(int f,int s){
//             this.f=f;
//             this.s=s;
//         }
//     }
//     public String[] findRelativeRanks(int[] org) {
//         int arr[] = new int[org.length];
//         for(int i=0;i<arr.length;i++){
//             arr[i] = org[i];
//         }

//         int n =arr.length;
//         pair nums[] = new pair[n];

//         for(int i=0;i<n;i++){
//             nums[i] = new pair( arr[i] , i+1 );
//         }

//         Arrays.sort( nums , (a,b)->{
//             pair p1 = a;
//             pair p2 = b;
            
//             if(p1.f < p2.f) return 1;
//             else if(p1.f > p2.f) return -1;

//             return 0;
//         } );


//         HashMap<Integer,Integer> map=new HashMap<>();

//         for(int i=0;i<n;i++){
//             map.put( nums[i].f , i+1 );
//         }

//         System.out.println(map);

//         String []a = new String[n];

//         for(int i=0;i<n;i++){
//             int v = map.get(arr[i]);
//             String s = "";
//             if(v==1) s+="Gold Medal";
//             else if(v==2) s+="Silver Medal";
//             else if(v==3) s+="Bronze Medal";
//             else s+=v;
            
//             a[i] = s;
//         }
//         return a;
//     }
// }