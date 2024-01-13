import java.util.*;
public class ArrayFindSmallestNumber {
    public static int smallestNumber(int numbers[]){
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<numbers.length; i++){
            if(numbers[i]<smallest){
                smallest = numbers[i];
            }
        }
        return smallest;
    }
    public static void main(String args[]){
        int arr[] = {90,20,30,10,50,60,70,80};
        int small_Value = smallestNumber(arr);
        System.out.println(small_Value+" is the smallest value in the given array.");
    }
}
