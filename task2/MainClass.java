package homework9.task2;

public class MainClass {
    public static void main(String[] args) {

        MyLinkedList linkedList = new MyLinkedList();
        System.out.println("---after add---");
        linkedList.add("one");
        linkedList.add(2);
        linkedList.add("string");
        linkedList.add('c');
        linkedList.add(5);
        System.out.println(linkedList);
        System.out.println("Size is " + linkedList.size());
        int indexNull = 0;
        int index = 2;
        System.out.println("---after remove index #" + indexNull + "---");
        linkedList.remove(indexNull);
        System.out.println(linkedList.get(index) + " is an object in index #" + index);
        linkedList.clear();
        System.out.println("Size is " + linkedList.size());
        System.out.println(linkedList);
    }
}