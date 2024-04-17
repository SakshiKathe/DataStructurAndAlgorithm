package Hashing;

import java.util.*;

public class ImplemetTreeSet {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();
        cities.add("Bengluru");
        cities.add("Delhi");
        cities.add("Pune");
        cities.add("Mumbai");
        cities.add("Nashik");

        TreeSet<String> ts = new TreeSet<>();
        ts.add("Bengluru");
        ts.add("Delhi");
        ts.add("Pune");
        ts.add("Mumbai");
        ts.add("Nashik");
        System.out.println(ts);

    }
}
