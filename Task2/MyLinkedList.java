package Homework9.Task2;

public class MyLinkedList<E> {
    int size = 0;
    Node<E> first;
    Node<E> last;


    void add(E e) {
        final Node<E> l = last;
        final Node<E> newNode = new Node<>(l, e, null);
        last = newNode;
        if (l == null)
            first = newNode;
        else
            l.next = newNode;
        size++;
    }

    Node<E> findNode(int index) {
        outOfBound(index);
        Node<E> x = first;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }

    public void remove(int index) {
        Node<E> e = findNode(index);
        final Node<E> next = e.next;
        final Node<E> prev = e.prev;

        if (prev == null) {
            first = next;
        } else {
            prev.next = next;
            e.prev = null;
        }

        if (next == null) {
            last = prev;
        } else {
            next.prev = prev;
            e.next = null;
        }
        size--;
    }

    public void clear() {
        for (Node<E> x = first; x != null; ) {
            Node<E> next = x.next;
            x.item = null;
            x.next = null;
            x.prev = null;
            x = next;
        }
        first = last = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public Object get(int index) {
        return findNode(index).item;
    }



    private void outOfBound(int index) {
        boolean isElementIndex = (index >= 0 && index < size);
        if (!isElementIndex) {
            throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
        }
    }

    private String outOfBoundsMsg(int index) {
        return "Index: " + index + ", Size: " + size;
    }

    public String toString() {
        Node<E> curr = first;
        StringBuilder sb = new StringBuilder();
        sb.append("LinkedList [");
        while (curr != null) {
            sb.append(curr.item);
            if (curr.next != null) {
                sb.append(", ");
            }
            curr = curr.next;
        }
        sb.append("]");
        return sb.toString();
    }
}