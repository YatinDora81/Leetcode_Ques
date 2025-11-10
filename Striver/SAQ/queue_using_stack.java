import java.util.Stack;

class queue_using_stack {
    public static void main(String[] args) {
        Queuee<Integer> q = new Queuee<Integer>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);

        for(int i=0;i<=6;i++){
            System.out.println(q.front());
            q.remove();

        }
    }

}

class Queuee<T> {
    Stack<T> st1 = new Stack<>();
    Stack<T> st2 = new Stack<>();
    private int size = 0;

    public boolean add(T val) {
        size++;
        st1.add(val);
        return true;
    }

    public int size() {
        return this.size;
    }

    public T front() {
        if (st1.size() == 0 && st2.size() == 0)
            return null;
        if (st2.size() == 0) {
            while (st1.size() != 0) {
                st2.add(st1.pop());
            }
        }
        return st2.peek();
    }

    public T remove() {
        if (st1.size() == 0 && st2.size() == 0)
            return null;
        if (st2.size() == 0) {
            while (st1.size() != 0) {
                st2.add(st1.pop());
            }
        }
        size--;
        return st2.pop();
    }

}