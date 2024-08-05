// // 2231. Largest Number After Digit Swaps by Parity

// class Solution {
//     public int largestInteger(int num) {
//         List<Integer> e = new ArrayList<>();
//         List<Integer> o = new ArrayList<>();
//         for(char ch : (""+num).toCharArray() ){
//             if( (ch-'0')%2==0 ) e.add(ch-'0');
//             else o.add(ch-'0');
//         }
//         Collections.sort(e);
//         Collections.sort(o);
        
//         // System.out.println(e);
//         // System.out.println(o);
//         StringBuilder sb = new StringBuilder();
//         for(char ch : (""+num).toCharArray() ){
//             if( (ch-'0')%2==0 ) sb.append(e.remove(e.size()-1));
//             else sb.append(o.remove(o.size()-1));
//         }
//         return Integer.parseInt(sb.toString());
//     }
// }