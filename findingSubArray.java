public class PrintSubArray {
    public static void findingSubArray(int numbers[]){
        int tp = 0;
        for(int i=0; i<numbers.length; i++){
            int start = i;
            for(int j=i; j<numbers.length; j++){
                int end = j;
                for(int k=start; k<=end; k++){
                    System.out.print(numbers[k]+" ");
                }
                tp++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total SubPairs of the given array : "+tp);
    }
    public static void main(String args[]){
        int arr[] = {2,4,6,8,10,12,14,16};
        findingSubArray(arr);
    }
}
