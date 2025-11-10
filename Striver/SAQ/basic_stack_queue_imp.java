class basic_stack_queue_imp{
    public static void main(String[] args) {
        // StackkUsingArray st1 = new StackkUsingArray(50);

        // System.out.println("Hello1");

        // for(int i=0;i<40;i++){

        //     try {
        //         st1.add(i);
        //         System.out.println(st1.peek() + " - " + st1.size);
        //     } catch (Exception e) {
        //         System.out.println(e);
        //     }
        // }

        // QueueUsingArray q1 = new QueueUsingArray(50);



        
    }
}

class StackkUsingArray{
    int size;
    int arr[];
    int curr;
    int n;

    public StackkUsingArray(int n){
        arr = new int[n];
        size = 0;
        curr = -1;
        this.n = n;
    }

    // 5
    // 2
    // 1

    public void add(int ele) throws Exception {
        if(curr+1>=n) throw new Exception("Out of Space!!!");
        curr++;
        arr[curr] = ele;
        size++;
    }

    public int peek() throws Exception{
        if(curr==-1) throw new Exception("Out of Space!!!");
        return arr[curr];
    }

    public int size(){
        return this.size;
    }

    public int remove() throws Exception{
        if(curr==-1) throw new Exception("Out of Space!!!");
        int ans = arr[curr];
        curr--;
        size--;
        return ans;
    }
}


class QueueUsingArray{
    int n;
    int size;
    int left;
    int right;
    int queue[];

    public QueueUsingArray(int n){
        this.n = n;
        size = 0;
        left = -1;
        right = -1;
        queue = new int[n];

    }

    public boolean add(int val){
        if(right+1>=n) return false;
        right++;
        if(left==-1 || size==0) left=0;
        queue[right] = val;

        size++;
        return true;
    }

    public int front(){
        if(left==-1) return Integer.MIN_VALUE;
        return queue[left];
    }

    public int remove(){
        if(left==-1 || left>right) return Integer.MIN_VALUE;
        if(size==1){
            int ans = queue[left];
            left = -1;
            right = -1;
            size--;
            return ans;
        }
        int ans = queue[left];
        left++;
        size--;
        return ans;

    }

    public int size(){
        return this.size;
    }
}
