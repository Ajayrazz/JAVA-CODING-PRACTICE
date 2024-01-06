import java.util.*;
public class PatternStarTriangle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value : ");
        int val = sc.nextInt();
        for(int i=1; i<=val; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
