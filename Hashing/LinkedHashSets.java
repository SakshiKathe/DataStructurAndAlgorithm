package Hashing;

import java.util.*;

public class LinkedHashSets {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();
        cities.add("Bengluru");
        cities.add("Delhi");
        cities.add("Pune");
        cities.add("Mumbai");
        cities.add("Nashik");
        System.out.println(cities);

        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Bengluru");
        lhs.add("Delhi");
        lhs.add("Pune");
        lhs.add("Mumbai");
        lhs.add("Nashik");
        System.out.println(lhs);

        lhs.remove("Delhi");
        System.out.println(lhs);
    }
}
