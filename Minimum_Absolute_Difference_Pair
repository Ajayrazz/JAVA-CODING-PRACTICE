import java.util.*;
public class Minimum_Absolute_Difference_Pair {
    public static void main(String args[]){
        int A[] = {4,1,8,7};
        int B[] = {2,3,5,6};

        //Sorting
        Arrays.sort(A);
        Arrays.sort(B);

        int minDiff = 0;
        
        for(int i=0; i<A.length; i++){
            minDiff += Math.abs(A[i] - B[i]);
        }
        System.out.println("Minimum absolute difference = "+minDiff);
    }
}
