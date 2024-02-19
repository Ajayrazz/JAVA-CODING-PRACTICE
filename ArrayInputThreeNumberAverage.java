import java.util.*;
public class ArrayInputThreeNumberAverage {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Enter value for array : ");
        for(int i=0; i<=2; i++){
            arr[i] = sc.nextInt();
        }
        int avg = (arr[0]+arr[1]+arr[2])/3;
        System.out.println("Average value : "+ avg);

    }
}
