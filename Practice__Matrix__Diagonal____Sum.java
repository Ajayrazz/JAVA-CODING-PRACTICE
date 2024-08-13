import java.util.*;
public class Practice__Matrix__Diagonal____Sum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int matrix[][] = new int[n][n];
        //input matrix
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        //diagonal sum algo
        int sum = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i == j || i+j == matrix.length-1){
                    sum += matrix[i][j];
                }
            }
        }

        System.out.println("Sum of diagional element of the given matrix -> " + sum);
    }
}
