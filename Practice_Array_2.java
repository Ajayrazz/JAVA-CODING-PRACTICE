import java.util.*;
public class Practice_Array_2 {
        
    public static int profit(int arr[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i=1; i<arr.length; i++){
            if(buyPrice > arr[i]){
                maxProfit = buyPrice - arr[i];
            }
            else{
                buyPrice = arr[i];
            }
        }
        return maxProfit;
    }  
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int price[] = new int[n]; //price of stocks
        for(int i=0; i<n; i++){
            price[i] = sc.nextInt();
        }
        System.out.println("Profit : "+profit(price));
    }

}
