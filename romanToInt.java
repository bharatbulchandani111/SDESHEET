public class romanToInt {
    public static int romanToInt(String s) {
        String str="MDCLXVI";
        int[] arr=new int[]{1000,500,100,50,10,5,1};
        int l=s.length()-1;
        int ans=0;
        while(l!=0){
            if(arr[(str.indexOf(s.charAt(l)))]<arr[(str.indexOf(s.charAt(l-1)))])
                ans-=arr[(str.indexOf(s.charAt(l)))];
            else
                ans+=arr[(str.indexOf(s.charAt(l)))];
            l--;
        }
        return ans+arr[(str.indexOf(s.charAt(0)))];

    }

    public static void main(String[] args) {
        System.out.println(romanToInt("VIII"));
    }
}
