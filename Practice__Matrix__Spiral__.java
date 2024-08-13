import java.util.*;
public class Practice__Matrix__Spiral__ {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int matrix[][] = new int[n][n];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        //algorithm for printing spriral matrix

        int startrow = 0;
        int startcol = 0;
        int endrow = matrix.length-1;
        int endcol = matrix[0].length-1;

        while(startrow <= endrow && startcol <= endcol){
            //top
            for(int i=startcol; i<=endcol; i++){
                System.out.print(matrix[startrow][i] + " ");
            }

            //right
            for(int j=startrow; j<=endrow; j++){
                System.out.print(matrix[j][endcol] + " ");
            }

            //bottom
            for(int i=endcol-1; i>=startcol; i--){
                if(startrow == endrow){
                    break;
                }
                System.out.print(matrix[endrow][i] + " ");
            }

            //left
            for(int j=endrow-1; j>startrow; j--){
                if(startcol == endcol){
                    break;
                }
                System.out.print(matrix[j][startcol] + " ");
            }

            startrow++;
            startcol++;
            endrow--;
            endcol--;
        }
    }
}
