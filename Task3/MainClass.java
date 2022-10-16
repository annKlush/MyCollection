package Homework9.Task3;

public class MainClass {
    public static void main(String[] args) {
        MyQueue que = new MyQueue();

        que.add("one");
        que.add(2);
        que.add("string");
        que.add('c');
        que.printQ(que.getQ());
        System.out.println("---after add---");
        que.add(5);

        que.printQ(que.getQ());
        System.out.println("Size is " + que.size());
        int indexNull = 0;
        int index = 0;
        System.out.println("---after remove index #" + indexNull + "---");
        que.remove(indexNull);
        que.printQ(que.getQ());
        System.out.println(que.get(index) + " is an object in index #" + index);
        System.out.println("The first element by peek is " + que.peek());
        que.printQ(que.getQ());
        System.out.println("The first element by pool is " + que.pool());
        que.printQ(que.getQ());
        que.clear();
        System.out.println("Size is " + que.size());
        que.printQ(que.getQ());
    }
}