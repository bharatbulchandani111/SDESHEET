package SDESHEET;
import java.util.ArrayList;
import java.util.List;

class generateSubarrays {
//    static void printSubArrays(int[] arr, int start, int end)
//    {
//        if (end == arr.length)
//            return;
//
//
//        else if (start <= end){
//            System.out.print("[");
//            for (int i = start; i < end; i++)
//                System.out.print(arr[i] + ", ");
//            System.out.println(arr[end]+"]");
//            printSubArrays(arr, start + 1, end);
//        }
//        else
//        printSubArrays(arr, 0, end + 1);
//        return;
//    }
//    public static void main(String args[])
//    {
//        int[] arr = { 1, 2, 3 };
//        printSubArrays(arr, 0, 0);
//    }
static void print3largest(int arr[], int arr_size)
{
    int i, first, second, third;

    /* There should be atleast three elements */
    if (arr_size < 3) {
        System.out.print(" Invalid Input ");
        return;
    }

    third = first = second = Integer.MIN_VALUE;
    for (i = 0; i < arr_size; i++) {
            /* If current element is greater than
            first*/
        if (arr[i] > first) {
            third = second;
            second = first;
            first = arr[i];
        }

            /* If arr[i] is in between first and
            second then update second  */
        else if (arr[i] > second && arr[i]!=first) {
            third = second;
            second = arr[i];
        }

        else if (arr[i] > third && arr[i]!=second)
            third = arr[i];
    }

    System.out.println("Three largest elements are " + first + " " + second + " " + third);
}

    /* Driver program to test above function*/
    public static void main(String[] args)
    {
        int arr[] = { 12, 13, 1, 10, 34, 13 };
        int n = arr.length;
        print3largest(arr, n);
    }
}
