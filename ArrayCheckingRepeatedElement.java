import java.util.*;
public class ArrayElementChecking {
    public static boolean checkingElement(int numbers[]){
        for(int i=0; i<numbers.length; i++){
            for(int j=i+1; j<numbers.length; j++){
                if(numbers[i] == numbers[j]){
                    return true;
                }
            }
            
        }
        return false;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter element for array : ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(checkingElement(arr));
    }
}
