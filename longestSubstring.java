
package SDESHEET;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class longestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        HashMap<Character ,Integer> map = new HashMap<>();
        int l=0;
        int r=0;
        int max=0;
        while(r<s.length()){
            char c=s.charAt(r);
            if(map.containsKey(c)){
              l=Math.max(l,map.get(c));
                l=map.get(c);
            }
            max=Math.max(max,r-l+1);
            map.put(c,r+1);
            r++;

        }
        return max;
    }
    public static int maxArea(int[] arr) {
        int i=0;
        int j=arr.length-1;
        int sum=-1;
        while(i<j){
            int min=Math.min(arr[i],arr[j]);
            sum=Math.max(sum,min*(j-i));
            if(arr[i]>arr[j])
                j--;
            else
                i++;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr= new int[]{1,3,100,2,5,4,8,3,7};
        System.out.println(maxArea(arr));
    }
}
