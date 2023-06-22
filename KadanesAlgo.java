public class KadanesAlgo {
    static int Kadanes(int[] arr) {
        int max=0;
        int curr=0;
        int c=0;
        for (int i = 0; i < arr.length; i++){
            curr+=arr[i];
            if(curr<0)
            {curr=0;
            c++;
            }
            if(curr>max)
                max=curr;
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = { -2, -3, -4, -1, -2, -1, -5, -3, -100,-89 };
        System.out.println(Kadanes(arr));
    }
}
