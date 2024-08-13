import java.util.*;
public class BubbleSortProblem {
    public static void main(String args[]){
        int arr[] = {3,6,2,1,8,7,4,5,3,1};
        int n = arr.length;

        for(int iteration = 0; iteration<n; iteration++){
            for(int index=0; index<n-1; index++){
                if(arr[index] < arr[index+1]){
                    int temp = arr[index];
                    arr[index] = arr[index+1];
                    arr[index+1] = temp;
                }
            }
        }

        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
