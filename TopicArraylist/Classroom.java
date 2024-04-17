package TopicArraylist;

import java.util.ArrayList;

public class Classroom {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // Add Element
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);

        // Get Element
        int element = list.get(2);
        System.out.println(element);

        // Remove element
        list.remove(2);
        System.out.println(list);

        // Set element at Index
        list.set(1, 10);
        System.out.println(list);

        // Contains element
        System.out.println(list.contains(1));

    }
}
