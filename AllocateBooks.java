package SDESHEET;

public class AllocateBooks {

    public static int allocateBooks(int[] books, int students) {
        if (books.length < students) {
            // Not enough books to allocate to each student
            return -1;
        }

        int totalBooks = books.length;
        int totalPages = 0;
        int max = -1;
        for (int i = 0; i < totalBooks; i++) {
            if(max<books[i])
                max=books[i];
            totalPages += books[i];
        }

        int start = max;
        int end = totalPages;
        int result = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (canAllocate(books, students, mid)) {
                // Try to minimize the maximum pages allocated
                result = mid;
                end = mid - 1;
            } else {
                // Not possible to allocate within mid pages, increase the pages
                start = mid + 1;
            }
        }

        return result;
    }

    private static boolean canAllocate(int[] books, int students, int maxPages) {
        int allocatedStudents = 1;
        int currentPageCount = 0;

        for (int i = 0; i < books.length; i++) {
            if (books[i] > maxPages) {
                // A book has more pages than the maximum allowed
                return false;
            }

            if (currentPageCount + books[i] > maxPages) {
                // Allocate current book to the next student
                allocatedStudents++;
                currentPageCount = books[i];

                if (allocatedStudents > students) {
                    // Cannot allocate to all students within the given pages
                    return false;
                }
            } else {
                // Allocate current book to the current student
                currentPageCount += books[i];
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] books = {5, 17, 100, 119,89,45};
        int students = 4;

        int result = allocateBooks(books, students);
        System.out.println("Minimum maximum pages allocated: " + result);
    }
}
