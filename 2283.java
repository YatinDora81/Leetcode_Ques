// // 2283. Check if Number Has Equal Digit Count and Digit Value

// class Solution {
//     public boolean digitCount(String num) {
//         HashMap<Integer,Integer> map=new HashMap<>();
//         for(char ch : num.toCharArray()){
//             int n = Integer.parseInt(ch+"");
//             if(map.containsKey(n)) map.put(n,map.get(n)+1);
//             else map.put(n,1);
//         }

//         for(int i=0;i<10;i++){
//             if(!map.containsKey(i)) map.put(i,0);
//         }

//         for(int i= num.length()-1;i>=0;i--){
//             int n = Integer.parseInt(num.charAt(i)+"");
//             if(map.containsKey(i) && map.get(i)!=n ){
//                 return false;
//             }
//             else{
//                 map.remove(i);
//             }
//         }

//         return true;
//     }
// }