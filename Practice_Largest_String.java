import java.util.*;
public class Practice_Largest_String {
    public static String largest(String str[]){
        String largest = str[0];
        for(int i=1; i<str.length; i++){
            if(largest.compareToIgnoreCase(str[i]) < 0){
                largest = str[i];
            }
        }
        return largest;
    }

    public static void print(String str[]){
        for(int i=0; i<str.length; i++){
            System.out.print(str[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value for n : ");
        int n = sc.nextInt();
        String str[] = new String[n];
        for(int i=0; i<n; i++){
            str[i] = sc.nextLine();
        }
        print(str);
        System.out.println("Largest string : "+largest(str));

    }
}
