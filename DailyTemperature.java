package SDESHEET;

import java.util.Stack;

public class DailyTemperature {
    public static int[] dailyTemperature(int[] arr){
        Stack<Integer> st = new Stack<>();
        int[] res = new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            while(!st.isEmpty() && arr[i]>=arr[st.peek()])
            st.pop();
            if(!st.isEmpty())
            res[i]=st.peek()-i;
            st.push(i);
        }
        return arr;
        
    }
     public static void main(String[] args) {
        
    }
}
