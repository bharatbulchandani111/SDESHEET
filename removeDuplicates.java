public class removeDuplicates {
    public static int removeDuplicates(int[] nums) {
        int shiftDistance = 0;
        int length = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                shiftDistance++;
            } else {
                nums[i-shiftDistance] = nums[i];
                length++;
            }
        }
        return length;
    }

    public static int removeDuplicate2(int[] nums){
        int x=3;
        for(int i=3;i<nums.length;i++){
            if(nums[i]!=nums[x-3]) {
                nums[x] = nums[i];
                x++;
            }

        }
        return x;
    }
    public static void main(String[] args) {
        System.out.println(removeDuplicate2(new int[]{1,1,1,1,2,2,2,2,3}));
    }
}
