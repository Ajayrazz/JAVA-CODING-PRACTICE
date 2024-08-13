import java.util.*;
public class Practice__Search__Sorted__Matrix {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();  //row
        int n = sc.nextInt() ; //column

        int target = sc.nextInt() ;

        int matrix[][] = new int[m][n] ;

        //taking matrix input
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                matrix[i][j] = sc.nextInt() ;
            }
        }

        //print user given 2d array
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        //code for finding whether the Target element is present in the 2d matrix or not

        boolean ans = false ;
        int row = 0;
        int col = matrix[0].length-1 ;

        while(row < matrix.length && col >= 0){
            if(matrix[row][col] == target){
                ans = true ;
            } else if(matrix[row][col] > target){
                col-- ;
            } else {
                row++;
            }
        }

        if(ans){
            System.out.println("Target element is present in the matrix.");
        } else {
            System.out.println("Target element is not present in the matrix.");
        }

    }
}
