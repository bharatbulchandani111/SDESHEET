
public class SquareRootBinarySearch {

    public static int sqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }

        int start = 1;
        int end = x;
        int result = 0;

        // Perform binary search within the range
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid == x / mid) {
                return mid;
            } else if (mid < x / mid) {
                start = mid + 1;
                result = mid;
            } else {
                end = mid - 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int number = 15;
        int squareRoot = sqrt(number);
        System.out.println("Square root of " + number + " is approximately: " + squareRoot);
    }
}
