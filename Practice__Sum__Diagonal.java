//program to find the sum of the diagonal element of a 2d array

import java.util.*;
public class Practice__Sum__Diagonal {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt() ;  //row
        int n = sc.nextInt() ;  //column

        int matrix[][] = new int[m][n] ;

        //taking input for 2D array
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                matrix[i][j] = sc.nextInt() ;
            }
        }

        //print 2d matrix
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println() ;

        //code for finding the sum of the diagonal element
        //Method 1
        int sum = 0 ;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(i == j){
                    sum += matrix[i][j];
                }
                else if(i+j == matrix.length-1){
                    sum += matrix[i][j] ;
                }
            }
        }

        System.out.println("Sum of the diagonal element of the matrix using method 1 -> " + sum);

        //Method 2
        int sum2 = 0;
        for(int i=0; i<m; i++){
            sum2 += matrix[i][i];

            if(i != matrix.length-1-i){
                sum2 += matrix[i][matrix.length-1-i];
            }
        }

        System.out.println("Sum of diagonal element of the matrix using method 2 -> " + sum2);
    }
}
