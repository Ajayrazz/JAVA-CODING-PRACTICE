import java.util.*;
public class BuyAndSellStock {
    public static int BuyAndSell(int price[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i=0; i<price.length; i++){
            if(price[i] > buyPrice){
                int profit = price[i] - buyPrice;
                maxProfit = Math.max(maxProfit,profit);
            } else {
                buyPrice = price[i];
            }
        }
        return maxProfit;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value for n : ");
        int n = sc.nextInt();
        int price[] = new int[n];
        for(int i=0; i<n; i++){
            price[i] = sc.nextInt();
        }
        System.out.println("Maximum profit : "+BuyAndSell(price));
    }
}
