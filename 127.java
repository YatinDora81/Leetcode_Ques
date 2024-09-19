// // 127. Word Ladder

// class Solution {
//     public int ladderLength(String bw, String ew, List<String> words) {
//         // we know that bfs give shortest path
//         // here we change only one index at one time from a-z
        
//         HashSet<String> wordList = new HashSet<>();
//         for(String s : words) wordList.add(s);

//         Queue<pair> q = new LinkedList<>();
//         HashSet<String> vis = new HashSet<>();
//         q.add( new pair( bw , 1 ) );
//         vis.add( bw );

//         while( q.size()>0 ){
//             pair p = q.remove();
//             if( p.s.equals( ew ) ) return p.c;

//             StringBuilder sb = new StringBuilder( p.s );

//             for(int i=0;i<sb.length();i++){
//                 for( char ch = 'a' ; ch <='z' ; ch++ ){
//                     sb.setCharAt( i , ch );
//                     if( !vis.contains(sb.toString()) && wordList.contains( sb.toString() ) ){
//                         q.add( new pair(sb.toString() , p.c +1 ) );
//                         vis.add( sb.toString() );
//                     }
//                 }
//                 sb = new StringBuilder( p.s );
//             }

//         }
        
//         return 0;
//     }

//     public class pair{
//         String s;
//         int c;
//         public pair(String s , int c){
//             this.s=s;
//             this.c=c;
//         }
//     }
// }