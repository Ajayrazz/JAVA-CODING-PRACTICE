import java.util.*;
public class Minimun_Absolute_Pair_Difference {
    public static void main(String args[]){
        int[] arr1 = {1,4,7,8};
        int[] arr2 = {2,3,5,6};

        //sort
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int minDiff = 0;
        for(int i=0; i<arr1.length; i++){
            minDiff += Math.abs(arr1[i] - arr2[i]);
        }

        System.out.println("Minimum difference between pair : " + minDiff);
    }
}
