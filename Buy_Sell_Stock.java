import java.util.*;
public class Buy_Sell_Stock {
    public static int maxProfit(int arr[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > buyPrice){
                int profit = arr[i] - buyPrice;
                maxProfit = Math.max(maxProfit,profit);
            } else {
                buyPrice = arr[i];
            }
        }
        return maxProfit;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int price[] = new int[n];
        for(int i=0; i<n; i++){
            price[i] = sc.nextInt();
        }
        System.out.println("Maximum Profit obtained : "+maxProfit(price));
    }
}
