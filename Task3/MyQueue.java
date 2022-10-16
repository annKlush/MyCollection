package Task3;

//import java.util.Queue
public class MyQueue<E> {
    private int count = 0;
    private Object[] q = new Object[count];

    private int front = 0;
    private int i = -1;


    public Object[] getQ() {
        return q;
    }

    public void add(Object value) {
        if (count > q.length - 1) {
            resize(q.length + 1);
        }
        q[++i] = value;
        count++;

    }

    public void remove(int index) {
        for (int i = index; i < count - 1; i++) {
            q[i] = q[i + 1];
        }
        count--;
        resize(q.length - 1);
    }

    public void clear() {
        count = 0;
        resize(0);
        System.out.println("Clear!");
    }

    public Object peek() {
        return q[0];
    }

    public Object pool() {
        Object temp = q[0];
        remove(0);
        return temp;
    }

    public Object get(int index) {
        for (int i = 0; i < count - 1; i++) {
            if (i == index) {
                return q[index];
            }
        }
        return q[index];
    }


    public int size() {
        return count;
    }

    private void resize(int len) {
        Object[] Array = new Object[len];
        System.arraycopy(q, 0, Array, 0, count);
        q = Array;
    }

    public <E> void printQ(E[] value) {
        StringBuilder sb = new StringBuilder();
        sb.append("MyQueue [");
        for (E item : value) {
            sb.append(item + " ");
        }
        sb.append("]");
        System.out.println(sb.toString());
    }

}
