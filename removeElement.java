package SDESHEET;
public class removeElement {
    public static int removeElement(int[] nums, int val) {
        if(nums.length==0)
            return 0;
        int i=0;
        int j=nums.length-1;
        while(i<=nums.length-1 && nums[i]>=0 ){
            while(nums[i]==val){
                swap(i,j,nums);
                j--;

            }
            i++;
        }
        if(nums[0]==-10){
            return 0;
        }
        while(i>=0 && nums[i-1]==-10){
            i--;
        }
        return i;
    }
    public static void swap(int a,int b,int[] nums){
        int x=a;
        int y=b;
        int temp=a;
        a=b;
        b=a;
        nums[x]=nums[a];
        nums[y]=-10;
    }

    public static void main(String[] args) {
        System.out.println(removeElement(new int[]{0,2,1,3,0,5,2,2},2));
    }
}
