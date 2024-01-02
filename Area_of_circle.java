import java.util.*;
public class Area_of_circle {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius : ");
        int rad = sc.nextInt();
        int area = (int)(3.14 * rad * rad) ;
        System.out.println("Area of circle : " + area);
    }
}
