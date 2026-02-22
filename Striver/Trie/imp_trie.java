// class Node{
//     Node arr[];
//     boolean flag;

//     Node(){
//         arr = new Node[26];
//         flag = false;
//     }

//     public boolean isAdreadyPresent(char ch){
//         return arr[ch-'a'] != null;
//     }

//     public Node getNode(char ch){
//         return arr[ch-'a'];
//     }
//     public void addNode(char ch){
//         if(isAdreadyPresent(ch)) return;
//         arr[ch-'a'] = new Node();
//     }

//     public void markFlag(){
//         this.flag = true;        
//     }

//     public boolean getFlag(){
//         return this.flag;
//     }

// }

// class Trie {
//     Node root;
//     public Trie() {
//         root = new Node();
//     }
    
//     public void insert(String word) {
//         Node t = root;
//         for(char ch : word.toCharArray()){
//             t.addNode(ch);
//             t = t.getNode(ch);
//         }
//         t.markFlag();
//     }
    
//     public boolean search(String word) {
//         Node t = root;
//         for(char ch : word.toCharArray() ){
//             if( !t.isAdreadyPresent(ch) ) return false;
//             t = t.getNode(ch);
//         }
//         return t.getFlag();
//     }
    
//     public boolean startsWith(String prefix) {
//         Node t = root;
//         for(char ch : prefix.toCharArray()){
//             if( !t.isAdreadyPresent(ch) ) return false;
//             t = t.getNode(ch);
//         }
//         return true;
//     }
// }

// /**
//  * Your Trie object will be instantiated and called as such:
//  * Trie obj = new Trie();
//  * obj.insert(word);
//  * boolean param_2 = obj.search(word);
//  * boolean param_3 = obj.startsWith(prefix);
//  */