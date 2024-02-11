// // //133. Clone Graph


// class Solution {
//     public Node cloneGraph(Node node) {
//         if(node == null) return null;
//         HashMap<Node ,Node> map=new HashMap<>();
//         return cloneUtil(node , map);
//     }
//     public Node cloneUtil(Node node , HashMap<Node ,Node> map){
//         Node newnode = new Node(node.val);
//         map.put(node,newnode);

//         for(Node neighbor : node.neighbors){
//             if(!map.containsKey(neighbor)){
//                 //not cloned
//                 newnode.neighbors.add( cloneUtil(neighbor , map) );
//             }
//             else{
//                 newnode.neighbors.add( map.get(neighbor) );
//             }
//         }
//         return newnode;
//     }
// }