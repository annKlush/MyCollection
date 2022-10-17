package homework9.task4;

public class MainClass {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.add("one");
        stack.add(2);
        stack.add("string");
        stack.add('c');
        System.out.println(stack);
        stack.printQ(stack.getQ());
        System.out.println("Size is " + stack.size());
        int indexNull = 2;
        int index = 2;
        System.out.println("---after remove index #" + indexNull + "---");
        stack.remove(indexNull);
        stack.printQ(stack.getQ());
        System.out.println(stack.get(index) + " is an object in index #" + index);
        System.out.println("peek is " + stack.peek());
        stack.printQ(stack.getQ());
        System.out.println("pool is " + stack.pool());
        stack.printQ(stack.getQ());
        stack.clear();
        stack.printQ(stack.getQ());
    }
}