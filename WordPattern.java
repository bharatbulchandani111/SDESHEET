package SDESHEET;

import java.util.HashMap;
import java.util.HashSet;

public class WordPattern {
    
    public boolean wordPattern(String pattern, String s) {
        String[] str=s.split(" ");
        if(pattern.length()!=str.length){
            return false;
        }
        HashSet<String> set=new HashSet<>();
        HashMap<Character,String> map = new HashMap<>();
        for(int i=0;i<pattern.length();i++){
            if(!map.containsKey(pattern.charAt(i)) && !set.contains(str[i])){
                map.put(pattern.charAt(i),str[i]);
                set.add(str[i]);
            }else{
                String s2=map.get(pattern.charAt(i));
                if(!str[i].equals(s2)){
                    return false;
                }
            }
        }
        return true;
    }
}

