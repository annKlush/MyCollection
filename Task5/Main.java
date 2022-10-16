package Homework9.Task5;



public class Main {

    public static void main(String[] args) {
        MyHashMap<String, Integer> map = new MyHashMap<>();
        map.put("Maths", 100);
        map.put("Science", 99);
        map.put("Social", 98);
        map.put("Marathi", 93);


        System.out.println(map);
        System.out.println("Size is "+ map.size());
        map.remove("Marathi");
        map.remove("English");
        System.out.println(map);
        System.out.println("Size is "+map.size());
        System.out.println(map.get("Maths"));
        map.clear();
        System.out.println(map);
        System.out.println("hi");
        System.out.println("Size is "+map.size());
        map.put("English", 150);
        System.out.println(map);
    }

}
