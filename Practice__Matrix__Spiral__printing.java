import java.util.*;
public class Practice__Matrix__Spiral__printing {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int matrix[][] = new int[n][n];

        //Taking input for matrix
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        //Algorithm for printing the spiral matrix
        int startrow = 0;
        int startcol = 0;
        int endrow = matrix.length-1;
        int endcol = matrix[0].length-1;

        while(startrow <= endrow && startcol <= endcol){

            //top
            for(int j=startcol; j<=endcol; j++){
                System.out.print(matrix[startrow][j] + " ");
            }

            //right
            for(int i=startrow+1; i<=endrow; i++){
                System.out.print(matrix[i][endcol] + " ");
            }

            //bottom
            for(int j=endcol-1; j>=startcol; j--){
                if(startrow == endrow){
                    break;
                }
                System.out.print(matrix[endcol][j] + " ");
            }

            //left
            for(int i=endrow-1; i>startrow; i--){
                if(startcol == endcol){
                    break;
                }
                System.out.print(matrix[i][startcol] + " ");
            }

            startrow++;
            startcol++;
            endrow--;
            endcol--;
        }
    }
}
