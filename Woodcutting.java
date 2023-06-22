import java.util.Arrays;

public class Woodcutting {

    public static int findMaxCuttingHeight(int[] woodLengths, int requiredWood) {
        // Sort the wood lengths in ascending order
        Arrays.sort(woodLengths);

        int left = 0;
        int right = woodLengths[woodLengths.length - 1];
        int maxCuttingHeight = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (isValidCut(woodLengths, requiredWood, mid)) {
                maxCuttingHeight = mid;
                left = mid + 1; // Increment left slightly to continue searching for a higher cutting height
            } else {
                right = mid - 1; // Decrement right slightly to continue searching for a lower cutting height
            }
        }

        return maxCuttingHeight;
    }

    private static boolean isValidCut(int[] woodLengths, int requiredWood, int cuttingHeight) {
        int obtainedWood = 0;

        for (int woodLength : woodLengths) {
            if (woodLength > cuttingHeight) {
                obtainedWood += (woodLength - cuttingHeight);
            }
        }

        return obtainedWood >= requiredWood;
    }

    public static void main(String[] args) {
        int[] woodLengths = {4, 7, 2, 10, 6};
        int requiredWood = 14;

        int maxCuttingHeight = findMaxCuttingHeight(woodLengths, requiredWood);
        System.out.println("Maximum cutting height: " + maxCuttingHeight);
    }
}
