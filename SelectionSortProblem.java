public class SelectionSortProblem {
    public static void main(String args[])
    {
        int arr[] = {3,6,2,1,8,7,4,5,3,1};
        int n = arr.length;

        for(int index=0; index<n; index++)
        {
            int max_value = arr[index];
            int max_index = index;

            for(int i=index+1; i<n; i++)
            {
                if(arr[i] > max_value)
                {
                    max_value = arr[i];
                    max_index = i;
                }
            }
            //swap
            int temp = arr[index];
            arr[index] = arr[max_index];
            arr[max_index] = temp;
        }

        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
