package SDESHEET;

public class IncreasingTriplet {

        public static  boolean increasingTriplet(int[] nums) {

            // Lets Start with two largest values, as soon as we find a number bigger than both, while both have been updated, return true.
            int chotaNo = Integer.MAX_VALUE,BadaNo = Integer.MAX_VALUE;

            for(int i=0;i<nums.length;i++){

                if(nums[i]<=chotaNo) chotaNo=nums[i];

                else if(nums[i]<=BadaNo) BadaNo = nums[i];

                else return true;

            }

            return false;
        }

    public static void main(String[] args) {
        System.out.println(increasingTriplet(new int[]{2,1,5,8,0,9}));
    }

}
