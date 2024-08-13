import java.util.*;
public class Practice___Valid____ANAGRAM {
    public static void main(String args[]){
        String str1 = "sheep" ;
        String str2 = "eehsp" ;

        //implementation
        HashMap<Character , Integer> hm = new HashMap<>();
        
        for(int i=0; i<str1.length(); i++){
            char ch = str1.charAt(i);
            hm.put(ch , hm.getOrDefault( ch , 0) + 1);
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

        System.out.println("Given Strings are valid anagram -> " + hm.isEmpty());
    }
}
