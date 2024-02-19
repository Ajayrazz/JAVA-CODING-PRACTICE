public class ArrayPairs {
    public static void printPair(int numbers[]){
        int tp = 0;
        for(int i=0; i<numbers.length; i++){
            int curr = numbers[i];
            for(int j=i+1; j<numbers.length; j++){
                System.out.print("("+curr+","+numbers[j]+")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total pair formed from the given array : "+tp);
    }
    public static void main(String args[]){
        int arr[] = {2,4,6,8,10,12,14,16};
        printPair(arr);
    }
}
