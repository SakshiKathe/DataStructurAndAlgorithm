package BitManipulation;

public class practice {
    public static void OddEven(int n) {
        int bitMask = 1;
        if ((n & bitMask) == 0) {
            System.out.println("Even number.");
        } else {
            System.out.println("Odd number");
        }
    }

    public static int getithBit(int n, int i) {
        int bitMask = 1;
        if ((n & bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        // OddEven(2);
        // OddEven(13);
        System.out.println(getithBit(10, 2));
    }
}
