// // 1525. Number of Good Ways to Split a String

// class Solution {
//     public int numSplits(String s) {
//         int pref[]= new int[s.length()];
//         int suff[]= new int[s.length()];
//         HashSet<Character> set= new HashSet<>();
//         for(int i=0;i<s.length();i++){
//             set.add(s.charAt(i));
//             pref[i] = set.size();
//         }
//         set = new HashSet<>();
//         for(int i=s.length()-1;i>=0;i--){
//             suff[i] = set.size();
//             set.add(s.charAt(i));
//         }

//         // System.out.println( Arrays.toString(pref) );
//         // System.out.print( Arrays.toString(suff) );
//         int ans=0;
//         for(int i=0;i<s.length();i++) if(pref[i]==suff[i]) ans++;
//         return ans;
//     }
// }