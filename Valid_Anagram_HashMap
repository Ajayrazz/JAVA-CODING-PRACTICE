import java.util.HashMap;

public class Valid_Anagram_HashMap {
    
    public static boolean ValidAnagram(String s , String t){
        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character , Integer> hm = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            hm.put(ch , hm.getOrDefault(ch, 0)+1);
        }

        for(int i=0; i<t.length(); i++){
            char ch = t.charAt(i);
            if(hm.get(ch) != null){
                if(hm.get(ch) == 1){
                    hm.remove(ch);
                } else {
                    hm.put(ch, hm.get(ch)-1);
                }
            }
        }
        return hm.isEmpty();
    }
    public static void main(String args[]){
        String s = "knee";
        String t = "keen";
        System.out.println(ValidAnagram(s, t));
    }
}
