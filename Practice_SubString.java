import java.util.*;
public class Practice_SubString {
    
    public static String subarray(String str, int si, int ei){
        String Sb_Arr = "";
        for(int i=si; i<=ei; i++){
            Sb_Arr += str.charAt(i);
        }
        return Sb_Arr;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("Input String : "+str);
        System.out.println("Subarray : "+subarray(str, 2, 5));
    }
}
