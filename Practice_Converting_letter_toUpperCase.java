import java.util.*;
public class Practice_Converting_letter_toUpperCase {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input string :");
        String str = sc.nextLine();

        //convert first letter of every word to upper case
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i=1; i<str.length(); i++){
            if(str.charAt(i) == ' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                sb.append(str.charAt(i));
            }
        }
        System.out.println("After converting every word of the user given matrix, string : "+ sb);
    }
}
