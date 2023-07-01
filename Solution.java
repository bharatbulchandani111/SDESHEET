package SDESHEET;

public class Solution {
    public static boolean isSubsequence(String s, String t) {
        int max=0;
        for(int i=0;i<s.length();i++){
            boolean b=true;
            char ch=s.charAt(i);
            for(int j=max;j<t.length();j++){
                char ch2=(t.charAt(j));
                if(ch==ch2){

                    if(j>=max)
                    {System.out.println(max+" "+j);
                        b=false;
                        max=j;
                        break;
                    }
                    else
                        return false;
                }

                if((b && j==t.length()-1) || (i!=s.length()-1 && j==t.length()-1))
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isSubsequence("acb","abdfgc"));
    }
}
