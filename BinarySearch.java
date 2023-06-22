public class BinarySearch {

    public static int countOccurrences(int[] arr, int target) {
        int firstIndex = findFirstIndex(arr, target);
        int lastIndex = findLastIndex(arr, target);

        if (firstIndex == -1 || lastIndex == -1) {
            return 0;
        }

        return lastIndex - firstIndex + 1;
    }

    private static int findFirstIndex(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                result = mid;
                high = mid - 1;  // Continue searching towards the left
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return result;
    }

    private static int findLastIndex(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                result = mid;
                low = mid + 1;  // Continue searching towards the right
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return result;
    }
    public static  int countSmallerorEqual(int[] arr,int target){
        int l=0;
        int h=arr.length-1;
        int res=-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(arr[mid]<=target){
                l=mid+1;
                res=mid;
            }
            else{
                h=mid-1;
            }
        }
        return res+1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 6, 7, 8, 10};
        int target = 5;

        int count = countOccurrences(arr, target);
        System.out.println("Occurrences: " + count);
        int res=countSmallerorEqual(arr,9);
        System.out.println(res);
    }
}
