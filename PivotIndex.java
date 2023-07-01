package SDESHEET;

public class PivotIndex {
    
    public static int pivotIndex(int[] nums) {
        int r=0;
        int l=0;
        for(int i=0;i<nums.length;i++){
            r+=nums[i];

        }

        for(int i=0;i<nums.length;i++){
            r-=nums[i];
            if(l==r)
            return i;
            l+=nums[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        
    }
}

