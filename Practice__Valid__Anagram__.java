import java.util.*;

public class Practice__Valid__Anagram__ {
    public static void main(String args[]){
        String str1 = "knee" ;
        String str2 = "keen" ;

        //program
        HashMap<Character , Integer> hm = new HashMap<>();

        for(int i=0; i<str1.length(); i++){
            char ch = str1.charAt(i);
            hm.put(ch , hm.getOrDefault(ch,0) + 1);
        }

        for(int j=0; j<str2.length(); j++){
            char ch = str2.charAt(j);
            if(hm.get(ch) != null){
                if(hm.get(ch) == 1){
                    hm.remove(ch);
                } else {
                    hm.put(ch , hm.get(ch) - 1);
                } 
            }
        }

        System.out.println("Given two string are valid anagram or not -> " + hm.isEmpty());
    }
}
