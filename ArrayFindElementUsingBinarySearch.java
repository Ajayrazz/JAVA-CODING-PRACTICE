public class ArrayFindElementUsingBinarySearch {
    public static int binarySearch(int numbers[], int k){
        int start = 0, end = numbers.length - 1;
        while(start <= end){
            int mid = (start + end)/2;
            if(numbers[mid] == k){
                return mid;
            }
            if(numbers[mid] < k){
                start = mid+1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[] = {2,4,6,8,10,12,14};
<<<<<<< HEAD
        int key = 12;
=======
        int key = 4;
>>>>>>> 29e397ec91a2ac6ea53aa674f790322940b662b3
        int index_value = binarySearch(arr,key);
        System.out.println("Index of the "+key+" is : "+index_value);

    }
}
