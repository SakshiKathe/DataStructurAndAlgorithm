package Hashing;

import java.util.*;

public class Iterators {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();
        cities.add("Bengluru");
        cities.add("Delhi");
        cities.add("Pune");
        cities.add("Mumbai");
        cities.add("Nashik");

        Iterator it = cities.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // Advanced for loop
        for (String city : cities) {
            System.out.println(city);
        }

    }
}
