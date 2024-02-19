import java.util.*;
public class ArrayLargestNumber {
    public static int getLargest(int numbers[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<numbers.length; i++){
            if(numbers[i]>largest){
                largest = numbers[i];
            }
        }
        return largest;
    }
    public static void main(String args[]){
        int arr[] = {2,4,100,8,15,5,7,50,10};
        int largestValue = getLargest(arr);
        System.out.println(largestValue+" is the largest value in the given array.");
    }
}
