// // 1472. Design Browser History

// class BrowserHistory {

//     public static class node{
//         String val;
//         node left;
//         node right;
//         node(String val){
//             this.val = val;
//         }
//     }

//     public static node curr;

//     public BrowserHistory(String homepage) {
//         curr = new node(homepage);
//     }
    
//     public void visit(String url) {
//         node nn = new node(url);
//         curr.right = nn;
//         nn.left = curr;
//         curr = nn;
//     }
    
//     public String back(int steps) {
//         for(int i=0;i<steps;i++){
//             if(curr.left!=null) curr = curr.left;
//         }
//         return curr.val;
//     }
    
//     public String forward(int steps) {
//         for(int i=0;i<steps;i++){
//             if(curr.right!=null) curr = curr.right;
//         }
//         return curr.val;
//     }
// }

// /**
//  * Your BrowserHistory object will be instantiated and called as such:
//  * BrowserHistory obj = new BrowserHistory(homepage);
//  * obj.visit(url);
//  * String param_2 = obj.back(steps);
//  * String param_3 = obj.forward(steps);
//  */