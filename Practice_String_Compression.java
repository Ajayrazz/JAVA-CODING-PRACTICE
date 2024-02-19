import java.util.*;
public class Practice_String_Compression {
    public static String compression(String str){
        String newStr = "";
        for(int i=0; i<str.length(); i++){
            int count = 0;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            newStr += str.charAt(i);
            if(count > 1){
                newStr += count;
            }
        }
        return newStr;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input String : ");
        String str = sc.nextLine();
        System.out.println("Compressed form of string : "+compression(str));
    }
}
