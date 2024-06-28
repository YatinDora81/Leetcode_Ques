// // 146. LRU Cache

// class LRUCache {

//     public static class node {
//         int k;
//         int v;
//         node left;
//         node right;

//         node(int k, int v) {
//             this.k = k;
//             this.v = v;
//         }
//     }

//     public static node head;
//     public static node tail;
//     public static HashMap<Integer, node> map;
//     public static int total;

//     public LRUCache(int capacity) {
//         this.total = capacity;
//         this.map = new HashMap<>();
//         this.head = null;
//         this.tail = null;
        
//     }
    
//     public int get(int key) {
//         if(map.containsKey(key)){
//             int k =key;
//             int v = map.get(key).v;

//             removenode(k);
//             addTail(k,v);
//             return v;
//         }
//         return -1;
//     }
    
//     public void put(int key, int value) {
//         if(map.containsKey(key)){
//             removenode(key);
//             addTail(key,value);
//         }
//         else{
//             if(map.size()==total) removehead();
//             addTail(key,value);
//         }
//     }

//     private static void removehead() {
//         if (head == null)
//             return;
//         if (head.left == null && head.right == null) {
//             head = null;
//             tail = null;
//             map = new HashMap<>();
//             return;
//         }
        
//         map.remove(head.k);
//         node t = head;
//         head = head.right;
//         head.left = null;
//         t.right = null;

//     }

//     private static void removenode(int k) {
//         if(!map.containsKey(k)) return;
//         if (head == null)
//             return;
//         if (head.k == k && head.left == null && head.right == null) {
//             head = null;
//             tail = null;
//             map = new HashMap<>();
//             return;
//         }

//         node t = map.get(k);
//         if (t == head) {
//             map.remove(k);
//             head = head.right;
//             head.left = null;
//             t.right = null;
//         } else if (t == tail) {
//             map.remove(k);
//             tail = tail.left;
//             tail.right = null;
//             t.left = null;
//         } else {
//             map.remove(k);
//             t.right.left = t.left;
//             t.left.right = t.right;
//         }
//     }

//     private static void addTail(int k, int v) {
//         if (tail == null && head == null) {
//             node nn = new node(k, v);
//             tail = nn;
//             head = tail;
//             map.put(k, nn);
//         } else {
//             node nn = new node(k, v);
//             nn.left = tail;
//             tail.right = nn;
//             tail = nn;
//             map.put(k, nn);
//         }
//     }
// }

// /**
//  * Your LRUCache object will be instantiated and called as such:
//  * LRUCache obj = new LRUCache(capacity);
//  * int param_1 = obj.get(key);
//  * obj.put(key,value);
//  */