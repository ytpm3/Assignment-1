//1
public class SumOfSquares {
    public static void main(String[] args) {
        int n = 4;
        int result = sumOfSquares(n);
        System.out.println("Sum of squares of the first " + n + " positive integers: " + result);
    }

    public static int sumOfSquares(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * n + sumOfSquares(n - 1);
        }
    }
}
