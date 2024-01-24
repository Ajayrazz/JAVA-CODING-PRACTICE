import java.util.*;
public class StringCompression {
    public static void compressedstring(String str){
        StringBuilder sc = new StringBuilder("");
        for(int i=0; i<str.length(); i++){
            Integer count = 1;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            sc.append(str.charAt(i));
            if(count>1){
                sc.append(count.toString());
            }
        }
        System.out.println(sc);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = sc.nextLine();
        compressedstring(str);
    }
}
