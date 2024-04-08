// // 1700. Number of Students Unable to Eat Lunch

// class Solution {
//     public int countStudents(int[] stu, int[] sand) {
//         HashMap<Integer,Integer> map=new HashMap<>();
//         map.put(0,0);
//         map.put(1,0);

//         for(int i : stu) map.put(i,map.get(i)+1);

//         Queue<Integer> q=new LinkedList<>();
//         for(int i : stu) q.add(i);
//         Stack<Integer> st=new Stack<>();
//         for(int i=sand.length-1;i>=0;i--) st.push(sand[i]);
//         while(q.size()>0 && st.size()>0){
//             if(map.get( st.peek() )<=0) break;
//             if(q.peek()==st.peek()){
//                 map.put( q.peek() , map.get(q.peek())-1 );
//                 st.pop();
//                 q.remove();
//             }
//             else{
                
//                 int t = q.remove();
//                 q.add(t);
//             }
//         }

//         return q.size();

//     }
// }