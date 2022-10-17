package homework9.task4;

//import Task3.MyQueue;

public class MainClass {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        System.out.println("Size is " + stack.size());
        stack.add("one");
        stack.add(2);
        stack.add("string");
        stack.add('c');
        stack.printQ(stack.getQ());
        System.out.println("---after add---");
        stack.add(5);

        stack.printQ(stack.getQ());
       System.out.println("Size is " + stack.size());
        int indexNull = 2;
        int index = 3;
        System.out.println("---after remove index #" + indexNull + "---");
        stack.remove(indexNull);
        stack.printQ(stack.getQ());
       System.out.println(stack.get(index) + " is an object in index #" + index);
        System.out.println("The first element by peek is " + stack.peek());
        stack.printQ(stack.getQ());
        System.out.println("The first element by pool is " + stack.pool());
        stack.printQ(stack.getQ());
        stack.clear();
        System.out.println("Size is " + stack.size());
       stack.printQ(stack.getQ());
    }
}