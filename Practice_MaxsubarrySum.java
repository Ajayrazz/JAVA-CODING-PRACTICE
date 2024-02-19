import java.util.*;
public class Practice_MaxsubarrySum {
    public static int maxSubArraySum(int arr[]){
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            int start = i;
            for(int j=i; j<arr.length; j++){
                int end = j;
                for(int k=start; k<=end; k++){
                    sum += arr[k];
                }
            }
        }
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value for n : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("User given array : ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(maxSubArraySum(arr));
    }
}
