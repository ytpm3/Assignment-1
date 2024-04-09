//3
public class SumOfPositiveIntegers {
    public static void main(String[] args) {
        int n = 5;
        int result = sumOfPositiveIntegers(n);
        System.out.println("Sum of the first " + n + " positive integers: " + result);
    }

    public static int sumOfPositiveIntegers(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumOfPositiveIntegers(n - 1);
    }
}