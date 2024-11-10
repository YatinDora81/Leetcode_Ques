// // 3238. Find the Number of Winning Players

// class Solution {
//     public int winningPlayerCount(int n, int[][] pick) {
//         HashMap<Integer,HashMap<Integer,Integer>> map = new HashMap<>();
//         for(int arr[] : pick){
//             int player = arr[0];
//             int ball = arr[1];
//             if(!map.containsKey(player)) map.put( player , new HashMap<>() );
//             if( !map.get(player).containsKey(ball) ) map.get(player).put(ball , 0 );
//             map.get(player).put(ball , map.get(player).get(ball)+1 );
//         }

//         // System.out.println( map );
//         int ans = 0;

//         for(int player : map.keySet()){

//             for(int ballKey : map.get(player).keySet() ){
//                 if( map.get(player).get(ballKey)>player ){
//                     ans++;
//                     break;
//                 }
//             }

//         }

//         return ans;
//     }
// }