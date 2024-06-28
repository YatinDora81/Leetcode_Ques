// // 1418. Display Table of Food Orders in a Restaurant

// class Solution {
//     public List<List<String>> displayTable(List<List<String>> orders) {

//         List<String> dish = new ArrayList<>();
//         List<Integer> cust = new ArrayList<>();
//         for(List<String> ll : orders){
//             if(!dish.contains(ll.get(2))) dish.add(ll.get(2));
//             if(!cust.contains(Integer.parseInt(ll.get(1)))) cust.add(Integer.parseInt(ll.get(1)));
//         }

//         Collections.sort(dish);
//         Collections.sort(cust);
//         HashMap<String,Integer> dishmap = new HashMap<>();
//         HashMap<Integer,Integer> custmap = new HashMap<>();
//         for(int i=0;i<dish.size();i++){
//             dishmap.put( dish.get(i) , i+1 );
//         }
//         for(int i=0;i<cust.size();i++){
//             custmap.put( cust.get(i) , i );
//         }

//         int arr[][]= new int[cust.size()][dish.size()+1];
        
//         for(int i=0;i<arr.length;i++){
//             arr[i][0] = cust.get(i);
//         }

//         for(List<String> ll : orders){
//             int i = custmap.get(Integer.parseInt(ll.get(1)));
//             int j = dishmap.get(ll.get(2));

//             arr[i][j] += 1;
//         }
//         List<List<String>> ans = new ArrayList<>();
        
//         List<String> ll = new ArrayList<>();
//         ll.add("Table");
//         for(String s : dish) ll.add(s);

//         ans.add(ll);
//         ll = new ArrayList<>();
//         for(int i=0;i<arr.length;i++){
//             ll = new ArrayList<>();
//             for(int j=0;j<arr[0].length;j++){
//                 ll.add(arr[i][j]+"");
//             }
//             ans.add(ll);
//         }

//         return ans;
//     }
// }