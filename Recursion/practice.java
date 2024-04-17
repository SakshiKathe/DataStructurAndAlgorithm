package Recursion;

public class practice {
    public static void printDec(int n) {

        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        printDec(n - 1);
    }

    public static void printInc(int n) {

        if (n == 1) {
            System.out.println(n);
            return;
        }
        printDec(n - 1);
        System.out.print(n + " ");
    }

    public static int fact(int n) {

        if (n == 0) {
            return 1;
        }

        int fnm1 = fact(n - 1);
        int fn = n * fnm1;
        return fn;
    }

    public static int calcSum(int n) {

        if (n == 1) {
            return 1;
        }

        int snm1 = calcSum(n - 1);
        int sn = n + snm1;
        return sn;
    }

    public static int fib(int n) {

        if (n == 0 || n == 1) {
            return n;
        }

        int fnm1 = fib(n - 1);
        int fnm2 = fib(n - 2);
        int fn = fnm1 + fnm2;
        return fn;
    }

    public static boolean isSorted(int arr[], int i) {

        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return isSorted(arr, i + 1);
    }

    public static int firstOccur(int arr[], int key, int i) {

        if (i == arr.length - 1) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return firstOccur(arr, key, i + 1);
    }

    public static int lastOcc(int arr[], int key, int i) {

        if (i == arr.length - 1) {
            return -1;
        }
        int isFound = lastOcc(arr, key, i + 1);
        if (isFound == -1 && arr[i] == key) {
            return i;
        }
        return isFound;
    }

    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * power(x, n - 1);
    }

    public static int optimizedPower(int a, int n) {

        if (n == 0) {
            return 1;
        }
        // n is even
        int halfPower = optimizedPower(a, n / 2);
        int halfPowerSq = halfPower * halfPower;

        // n is odd
        if (n % 2 != 0) {
            halfPowerSq = a * halfPowerSq;
        }
        return halfPowerSq;
    }

    public static void main(String[] args) {
        // int arr[] = { 8, 3, 6, 9, 5, 10, 2, 5, 3 };
        // printDec(n);
        // printInc(n);
        // System.out.println(fact(n));
        // System.out.println(calcSum(n));
        // System.out.println(fib(n));
        // System.out.println(isSorted(arr, 0));
        // System.out.println(firstOccur(arr, 5, 0));
        // System.out.println(lastOcc(arr, 5, 0));
        // System.out.println(power(2, 5));
        System.out.println(optimizedPower(2, 5));
    }
}