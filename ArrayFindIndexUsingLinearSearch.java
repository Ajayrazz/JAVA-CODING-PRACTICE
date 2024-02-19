import java.util.*;
public class ArrayFindIndexUsingLinearSearch{
    public static int linearSearch(int numbers[], int k){
        for(int i=0; i<numbers.length; i++){
            if(numbers[i] == k){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[] = {2,4,6,8,10,12,14};
        int key = 10;
        int index = linearSearch(arr,key);
        if(index == -1){
            System.out.println("Not found.");
        } else {
            System.out.println(key+" is at "+index+" index in the given array.");
        }
    }
}