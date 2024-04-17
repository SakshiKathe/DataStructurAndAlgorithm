//print the number of 7's that are in the 2d array
package Two_D_Array;

public class Ass1 {
    public static void Counting(int array[][]) {
        int countOf7 = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j] == 7) {
                    countOf7++;
                }
            }
        }
        System.out.println("count of 7 is: " + countOf7);
    }

    public static void main(String[] args) {
        int array[][] = { { 4, 7, 8 },
                { 8, 8, 7 } };
        Counting(array);
    }
}
