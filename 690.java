// // 690. Employee Importance

// /*
// // Definition for Employee.
// class Employee {
//     public int id;
//     public int importance;
//     public List<Integer> subordinates;
// };
// */

// class Solution {
//     public int getImportance(List<Employee> ll, int id) {
//         Queue<Employee> q = new LinkedList<>();
//         HashMap<Integer,Employee> map = new HashMap<>();
//         for(Employee e : ll){
//             map.put(e.id , e);
//         }
//         if(map.containsKey(id)) q.add( map.get(id) );

//         int ans = 0;
//         // boolean 
//         HashSet<Integer> set = new HashSet<>();
//         while(q.size()>0){
//             Employee e = q.remove();
//             set.add(e.id);
//             ans += e.importance;
//             for(int emp : e.subordinates){
//                 if(!set.contains(emp)) q.add(map.get(emp));
//             }
//         }

//         return ans;
//     }
// }