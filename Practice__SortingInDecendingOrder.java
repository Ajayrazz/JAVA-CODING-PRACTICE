//program for sorting an array in descending order by using collections frame

import java.util.*;
public class Practice__SortingInDecendingOrder {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int array[] = new int[n];

        //taking array input
        for(int i=0; i<n; i++){
            array[i] = sc.nextInt();
        }

        //print user given array
        for(int i=0; i<n; i++){
            System.out.print(array[i] + " ");
        }

        //sorting array by using collection frame
        Arrays.sort(array , Collections.reverseOrder());

        //printing sorted array
        for(int i=0; i<n; i++){
            System.out.print(array[i] + " ");
        }
    }
}
