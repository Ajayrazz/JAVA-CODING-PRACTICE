import java.util.*;
public class Practice_Array_1 {
    public static boolean checkingArray(int arr[]){
        //checking each element that whether it is repeating or not
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(checkingArray(arr));
    }
}
