package Task1;
import java.util.ArrayList;

public class MyArrayList{
    int size = 5;

    public int length = 0;
    Object[] arr = new Object[size];


    public void add(Object value) {
        if (length > arr.length - 1) {
            resize(arr.length + 1);
        }
        arr[length++] = value;
    }

    public void resize(int len) {
        Object[] Array = new Object[len];
        System.arraycopy(arr, 0, Array, 0, length);
        arr = Array;
    }


    public Object[] remove(int index) {
        for (int i = index; i < length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        length--;
        resize(arr.length - 1);
        return arr;
    }

    public int size() {
        return length;
    }


    public Object get(int index) {
        if (arr.length > index) {
            return arr[index];
        } else {
            return "null";
        }
    }

    public void clear() {
        length = 0;
        resize(0);
        System.out.println("Clear!");
    }

    public <E> void printArray(E[] value) {
        StringBuilder sb = new StringBuilder();
        sb.append("MyArrayList [");
        for (E item : value) {
            sb.append(item + " ");
        }
        sb.append("]");
        System.out.println(sb.toString());
    }
}
