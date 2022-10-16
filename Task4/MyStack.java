package Task4;

public class MyStack {
    private int mSize = 0;
    private Object[] q = new Object[mSize];
    private int count = 0;

    private int i = -1;


    public Object[] getQ() {
        return q;
    }
    void resize(int len, int x) {
        Object[] Array = new Object[len];
        System.arraycopy(q, 0, Array, x, count);
        q = Array;
    }


    public void add(Object value) {
        if (count >= mSize) {
            resize(count + 1, 1);
        }
        q[0] = value;
        count++;
    }

    public void remove(int index) {
        for (int i = index; i < count - 1; i++) {
            q[i] = q[i + 1];
        }
        count--;
        resize(count + 2, 0);
    }

    public void clear() {
        count = 0;
        resize(0, 0);
        System.out.println("Clear!");
    }

    public Object peek(){
        return q[0];
    }

    public Object pool(){
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



    public <E> void printQ(E[] value) {
        StringBuilder sb = new StringBuilder();
        sb.append("MyStack [");
        for (E item : value) {
            sb.append(item + " ");
        }
        sb.append("]");
        System.out.println(sb.toString());
    }
}
