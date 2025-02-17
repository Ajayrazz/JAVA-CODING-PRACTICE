//program to sort an array in increasing order using insertion sort

import java.util.*;
public class Practice__inserting__sort {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int array[] = new int[n] ;

        //Taking array input
        for(int i=0; i<n; i++){
            array[i] = sc.nextInt();
        }

        //print the user given input array
        for(int i=0; i<n; i++){
            System.out.print(array[i] + " ");
        }

        //sort array by using insertion sort
        for(int i=0; i<n-1; i++){
            int minpos = i;
            for(int j=i+1; j<n; j++){
                if(array[minpos] > array[j]){
                    minpos = j;
                }
            }
            //swap
            int temp = array[minpos];
            array[minpos] = array[i] ;
            array[i] = temp;
        }

        System.out.println();

        //print the sorted array
        for(int i=0; i<n; i++){
            System.out.print(array[i] + " ");
        }
    }
}
