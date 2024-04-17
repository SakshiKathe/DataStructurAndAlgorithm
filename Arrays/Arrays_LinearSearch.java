package Arrays;

import java.util.*;

// public class Arrays_LinearSearch {
//     public static int LinearSearch(int numbers[], int key) {

//         for (int i = 0; i < numbers.length; i++) {
//             if (numbers[i] == key) {
//                 return i;
//             }
//         }
//         return -1;
//     }

//     public static void main(String[] args) {
//         int numbers[] = { 2, 4, 6, 8, 10, 12, 14, 16 };
//         int key = 10;

//         int index = LinearSearch(numbers, key);
//         if (index == -1) {
//             System.out.println("Key is not found.");
//         } else {
//             System.out.println("Key is found at index: " + index);
//         }
//     }
// }

//Linear search using Strings
// public class Arrays_LinearSearch {
//     public static boolean LinearSearch(String menu[], String key) {
//         for (int i = 0; i < menu.length; i++) {
//             if (menu[i] == key) {
//                 return true;
//             }
//         }
//         return false;
//     }

//     public static void main(String[] args) {
//         String menu[] = { "Chole", "Samosa", "Patties", "Paratha" };
//         String key = "Pani Puri";

//         boolean index = LinearSearch(menu, key);
//         if (index == false) {
//             System.out.println("Key is not found");
//         } else {
//             System.out.println("Key is found");
//         }

//     }
// }

public class Arrays_LinearSearch {
    public static boolean linearsearch(String menu[], String item) {
        for (int i = 0; i < menu.length; i++) {
            if (menu[i] == item) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String menu[] = { "samosa", "Aloo parotha", "Sandwich", "Butter chicken" };
        String item = "Sandwich";

        Boolean index = linearsearch(menu, item);
        if (index == false) {
            System.out.println("Item is not found in the menu list.");
        } else {
            System.out.println("Item is found at index." + index);
        }
    }
}