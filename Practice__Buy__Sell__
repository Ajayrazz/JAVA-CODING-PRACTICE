import java.util.*;
public class Practice__Buy__Sell__ {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];

        //taking input array
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int buyPrice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for(int i=0; i<n; i++){
            if(arr[i] > buyPrice){
                int profit = arr[i] - buyPrice ;
                maxprofit = Math.max(profit , maxprofit) ;
            } else {
                buyPrice = arr[i] ;
            }
        }

        System.out.println("Maximum profit earned -> " + maxprofit) ;
    }
}
