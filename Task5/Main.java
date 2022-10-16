package Task5;

public class Main {

    public static void main(String[] args) {

        MyHashMap<String, Integer> map = new MyHashMap<>();
        map.put("Maths", 100);
        map.put("Science", 99);
        map.put("Social", 98);
        map.put("Marathi", 93);


        map.display();
        System.out.println("Size is "+ map.size());
        map.remove("Marathi");
        map.remove("English");
        map.display();
        System.out.println("Size is "+map.size());
        System.out.println(map.get("Maths"));
        map.clear();
        map.display();
        System.out.println("hi");
        System.out.println("Size is "+map.size());
    }

}
