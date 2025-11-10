import java.util.LinkedList;
import java.util.Queue;

public class stack_using_queue {
    public static void main(String[] args) {
        Stackk<Integer> st = new Stackk<Integer>();
        st.add(1);
        st.add(2);
        st.add(3);
        st.add(4);
        st.add(5);

        for(int i=0;i<=5;i++){
            System.out.println(st.peek());
            st.remove();
        }

        System.out.println(st.size());

    }
}

class Stackk<T> {
    Queue<T> q1 = new LinkedList<>();
    Queue<T> q2 = new LinkedList<>();

    public boolean add(T val) {
        q2.add(val);
        while (q1.size() != 0) {
            q2.add(q1.remove());
        }
        while (q2.size() != 0) {
            q1.add(q2.remove());
        }
        return true;
    }

    public int size() {
        return q1.size();
    }

    public T peek() {
        if (q1.size() == 0)
            return null;
        return q1.peek();
    }

    public T remove() {
        if (q1.size() == 0)
            return null;
        return q1.remove();
    }

}