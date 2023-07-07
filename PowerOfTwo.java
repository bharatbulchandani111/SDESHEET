package SDESHEET;

public class PowerOfTwo {
    
    public boolean isPowerOfTwo(int n) {
        if(n==0)
        return false;
        if(n==1)
        return true;
        int ans=(int)(Math.log(n)/Math.log(2));
        if(Math.pow(2,ans)==n)
        return true;
        else
        return false;
    }
}

