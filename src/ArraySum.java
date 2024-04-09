//2
public class ArraySum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = 3;
        int result = sumOfElements(arr, n);
        System.out.println("Sum of the first " + n + " elements: " + result);
    }

    public static int sumOfElements(int[] arr, int n) {
        if (n <= 0) {
            return 0;
        }

        return sumOfElements(arr, n - 1) + arr[n - 1];
    }
}


