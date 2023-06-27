import java.util.ArrayList;

public class PascalTriangle {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> l= new ArrayList<>();
        for(int i=0;i<n;i++){
            List<Integer> temp = new ArrayList<>();
        if(i==0){
            
            temp.add(1);
            l.add(temp); 
        }
        if(i==1){
            
            temp.add(1);
            temp.add(1);
            l.add(temp); 
        }
        if(i>1){
    
            temp.add(1);
            for(int j=0;j<i-1;j++){
                temp.add(l.get(i-1).get(j)+l.get(i-1).get(j+1));
            }
            temp.add(1);
            l.add(temp);
        }
        }
        return l;

    }
    public static void main(String[] args) {
        
    }
}