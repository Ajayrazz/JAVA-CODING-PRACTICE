//program to calculate triplet sum whose sum is equal to 0

public class triplet_sum {
    public static void main(String args[]){
        int arr[] = {-1,0,1,2,-1,-4};
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                for(int k=i+2; k<arr.length; k++){
                    if(arr[i]+arr[j]+arr[k]==0 && arr[i]!=arr[j] && arr[i]!=arr[k] && arr[j]!=arr[k]){
                        System.out.println("["+arr[i]+","+arr[j]+","+arr[k]+"]");
                    }
                }
            }
        }
    }
}
