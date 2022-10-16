package Homework9.Task1;

public class MainClass {
    public static void main(String[] args) {

        MyArrayList arrayList = new MyArrayList();
        System.out.println("---after add---");
        arrayList.add(1);
        arrayList.add("two");
        arrayList.add('c');
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(25);
        arrayList.printArray(arrayList.arr);

        int index = 6;
        System.out.println(arrayList.get(index) + " is an object in index #" + index);

        System.out.println("---after remove index #" + index + "---");
        arrayList.printArray(arrayList.remove(index));
        System.out.println("Size is " + arrayList.size());

        arrayList.clear();

    }
}
