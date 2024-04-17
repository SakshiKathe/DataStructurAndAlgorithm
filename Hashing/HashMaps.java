package Hashing;

import java.util.*;

public class HashMaps {
    public static void main(String[] args) {
        // Create
        HashMap<String, Integer> hm = new HashMap<>();

        // Insert
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);

        System.out.println(hm);

        // Get
        int population = hm.get("India");
        System.out.println(population);

        // key not exist
        System.out.println(hm.get("Indoneshia"));

        // ConatinsKey
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("Indonesia"));

        // Remove
        System.out.println(hm.remove("China"));
        System.out.println(hm);

        // size
        System.out.println(hm.size());

        // Is Empty
        System.out.println(hm.isEmpty());

        // Clear
        hm.clear();
        System.out.println(hm.isEmpty());

    }
}
