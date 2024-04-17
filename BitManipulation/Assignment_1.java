package BitManipulation;

public class Assignment_1 {
    public static void main(String[] args) {
        int x = 3, y = 4;
        System.out.println("Before Swap x = " + x + " and y = " + y);
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        System.out.println("After swapping x =" + x + " and y = " + y);
    }
}
