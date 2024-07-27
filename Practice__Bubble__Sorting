//Program to sort an array in ascending order

import java.util.*;
public class Practice__Bubble__Sorting {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int array[] = new int[n] ;

        //Taking input for array
        for(int i=0; i<n; i++){
            array[i] = sc.nextInt() ;
        }

        //print the user given array
        for(int i=0; i<n; i++){
            System.out.print(array[i] + " ");
        }

        //Algorithm for sorting array using bubble sort method
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-1-i; j++){
                if(array[j] > array[j+1]){
                    //swap
                    int temp = array[j] ;
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

        System.out.println();

        //print the sorted array
        for(int i=0; i<n; i++){
            System.out.print(array[i] + " ");
        }
    }
}
