package SDESHEET;
class MoveZeroes {
    public static void moveZeroes(int[] nums) {
     int count=0;
     for(int i=0;i<nums.length;i++){
      if(nums[i]!=0 )
        nums[count++]=nums[i];
        }
     for(int j=count;j<nums.length;j++){
        nums[j]=0;
        }
    }

    public static void main(String[] args) {
        moveZeroes(new int[]{1,0,0,1,0});
    }
}

