import java.util.*;
public class String_ConvertFirstLetterOfWordToUpperCase {
    public static String ConvertLetterToUpperCase(String sen){
        StringBuilder sb = new StringBuilder("");
        
        char ch = Character.toUpperCase(sen.charAt(0));
        sb.append(ch);

        //loop
        for(int i=1; i<sen.length(); i++){
            if(sen.charAt(i) == ' ' && i<sen.length()-1){
                sb.append(sen.charAt(i));
                i++;
                sb.append(Character.toUpperCase(sen.charAt(i)));
            }
            else{
                sb.append(sen.charAt(i));
            }
        }
        return sb.toString();

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String sen = sc.nextLine();
        System.out.println(ConvertLetterToUpperCase(sen));
    }
}
