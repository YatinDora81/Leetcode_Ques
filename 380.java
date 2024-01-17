// // 380. Insert Delete GetRandom O(1)
// class RandomizedSet {
//     HashMap<Integer,Integer> map;
//     List<Integer> ll;
//     public RandomizedSet() {
//         ll=new ArrayList<>();
//         map=new HashMap<>();
//     }
    
//     public boolean insert(int val) {
//         if(map.containsKey(val)) return false;
//         ll.add(val);
//         map.put(val,ll.size()-1);
//         return true;
//     }
    
//     public boolean remove(int val) {
//         if(!map.containsKey(val)) return false;
//         int index = map.get(val);
//         ll.set(index, ll.get(ll.size() - 1));
//         map.put(ll.get(index), index);
//         ll.remove(ll.size()-1);
//         map.remove(val);
//         return true;
//     }
    
//     public int getRandom() {
//         Random rand=new Random();
//         return ll.get(rand.nextInt(ll.size()));
//     }
// }