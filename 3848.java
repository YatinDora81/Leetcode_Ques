// class Solution {
//     public boolean isDigitorialPermutation(int n) {
//         String s = n+"";
//         List<String> ans = new ArrayList<>();
//         boolean used[] = new boolean[s.length()];
//         // solve(s , used, "" , ans);

//         System.out.println(ans);
//         HashMap<Integer,Integer> dp = new HashMap<>();
        
//         // for(String t : ans){
//             // int num = Integer.parseInt(t);
//             String t = n + "";
//             int sum = 0;
//             for(char ch : t.toCharArray()){
//                 int fact = cal(ch-'0',dp);
//                 sum = sum + fact;
//             }
            
//             System.out.println(t + " " + sum);
//             if(sum==n) return true;
//         // }
//         return is(sum , n);
//     }

//     public boolean is(int i,int j){
//         HashMap<Character,Integer> map = new HashMap<>();
//         String s1 = i+"";
//         String s2 = j+"";

//         for(char ch : s1.toCharArray()){
//             if(!map.containsKey(ch)) map.put(ch , 0);
//             map.put(ch , map.get(ch)+1);
//         }
//         for(char ch : s2.toCharArray()){
//             if(!map.containsKey(ch)) return false;
//             if(map.get(ch)==1) map.remove(ch);
//             else map.put(ch , map.get(ch)-1);
//         }

//         for(char ch : map.keySet()){
//             if(map.get(ch)!=0) return false;
//         }
//         return true;
//     }

//     public int cal(int n , HashMap<Integer,Integer> dp){
//         if(n<=1) return 1;
//         if(dp.containsKey(n)) return dp.get(n);

//         int ans = n * cal(n-1,dp);
//         dp.put(n, ans);
//         return ans;
//     }

//     public void solve(String s, boolean[] used , String t , List<String> ll){
//         if(s.length()==t.length()){
//             ll.add(t);
//             return;
//         }
//         for(int i=0;i<s.length();i++){
//             if(used[i]) continue;
//             used[i] = true;
//             solve(s , used , t + s.charAt(i) , ll);
//             used[i] = false;
//         }
//     }
    
    
// }