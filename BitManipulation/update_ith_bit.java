package BitManipulation;

public class update_ith_bit {
    public class set_ith_bit {
        public static int setithBit(int n, int i) {
            int bitMask = 1 << i;
            return n | bitMask;
        }

        public static int clearithBit(int n, int i) {
            int bitMask = ~(1 << i);
            return n & bitMask;
        }

        public static int updateIthBit(int n, int i, int newBit) {
            // if (newBit == 0) {
            // return clearithBit(n, i);
            // } else {
            // return setithBit(n, i);
            // }

            n = clearithBit(n, i);
            int BitMask = newBit << i;
            return n | BitMask;
        }

        public static void main(String[] args) {
            System.out.println(updateIthBit(10, 2, 1));
        }
    }
}
