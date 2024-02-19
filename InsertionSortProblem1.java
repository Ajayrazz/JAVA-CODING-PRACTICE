public class InsertionSortProblem1 {
    public static void main(String args[]){
        int arr[] = {3,6,2,1,8,7,4,5,3,1};
        int n = arr.length;

        for(int index=1; index<n; index++)
        {
            int temp = arr[index];
            int previous = index-1;

            while(previous >= 0 && temp > arr[previous])
            {
                arr[previous+1] = arr[previous];
                previous--;
            }
            //insertion
            arr[previous+1] = temp;
        }

        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
