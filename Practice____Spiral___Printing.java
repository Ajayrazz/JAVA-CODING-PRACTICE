public class Practice____Spiral___Printing {
    public static void main(String args[]){
        int matrix[][] = {{1,2,3,4},{4,5,6,7},{8,9,10,11},{12,13,14,15}};

        //algorithm
        int startrow = 0;
        int startcol = 0;
        int endrow = matrix.length-1;
        int endcol = matrix[0].length-1;

        while(startrow <= endrow && startcol <= endcol){
            //top
            for(int i=startcol; i<=endcol; i++){
                System.out.print(matrix[startrow][i] +" ");
            }

            //right
            for(int j=startrow+1; j<=endrow; j++){
                System.out.print(matrix[j][endcol] + " ");
            }

            //bottom
            for(int i=endcol-1; i>=startcol; i--){
                System.out.print(matrix[endrow][i] + " ");
            }

            //left
            
        }
    }
}
