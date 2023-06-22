
public class PaintersPartition {

    public static int partitionPainters(int[] boards, int painters) {
        int totalBoards = boards.length;
        int totalLength = 0;
        for (int i = 0; i < totalBoards; i++) {
            totalLength += boards[i];
        }

        int start = getMax(boards);
        int end = totalLength;
        int result = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (canPartition(boards, painters, mid)) {
                // Try to minimize the maximum time required
                result = mid;
                end = mid - 1;
            } else {
                // Not possible to partition within mid time, increase the time
                start = mid + 1;
            }
        }

        return result;
    }

    private static boolean canPartition(int[] boards, int painters, int maxTime) {
        int totalPainters = 1;
        int currentTime = 0;

        for (int i = 0; i < boards.length; i++) {
            currentTime += boards[i];

            if (currentTime > maxTime) {
                // Allocate current board to the next painter
                totalPainters++;
                currentTime = boards[i];

                if (totalPainters > painters) {
                    // Cannot partition within the given time
                    return false;
                }
            }
        }

        return true;
    }

    private static int getMax(int[] boards) {
        int max = Integer.MIN_VALUE;

        for (int board : boards) {
            max = Math.max(max, board);
        }

        return max;
    }

    public static void main(String[] args) {
        int[] boards = {10, 20, 30, 40};
        int painters = 2;

        int result = partitionPainters(boards, painters);
        System.out.println("Minimum time required: " + result);
    }
}
