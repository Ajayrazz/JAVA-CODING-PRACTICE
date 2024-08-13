public class Practice___String__Compresseion {
    
    public static String compression(String str){
        //algo
        StringBuilder comp = new StringBuilder("");

        for(int i=0; i<str.length(); i++){
            Integer count = 0;
            while(i < str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            comp.append(str.charAt(i));
            if(count > 1){
                comp.append(count);
            }
        }

        return comp.toString();
    }
    public static void main(String args[]){
        String str = "aaaaaahhhhhbbbbbbnnnndddddsssoooooppppp";

        System.out.println("String after compression -> " + compression(str));
    }
}
