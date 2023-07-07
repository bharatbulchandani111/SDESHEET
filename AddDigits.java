package SDESHEET;

public class AddDigits {
    public int addDigits(int n) {
        String s = n + "";
        if(s.length()==1)
        return Integer.parseInt(s);
        int sum=0;
        while(n!=0){
            int ans = n%10;
            sum += ans;
            n = n/10;
        }
        return addDigits(sum);
    }
}
