public class Practice_Insertion_Sort_Algorithm {
    public static void main(String args[]){
        int arr[] = {5,4,1,3,2};

        //inertion sort algo
        for(int i=0; i<arr.length; i++){
            int curr = arr[i] ;
            int prev = i-1;

            while(prev >= 0 && arr[prev] > curr){
                arr[prev+1] = arr[prev];
                prev-- ;
            }

            //insertion
            arr[prev+1] = curr ;
        }

        // printing
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
