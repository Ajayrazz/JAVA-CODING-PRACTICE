import java.util.*;
public class Practice_Buy_Sell2 {
    public static int profit(int price[]){
        int buyPrice = price[0];
        int maxprofit = 0;
        for(int i=0; i<price.length; i++){
            if(price[i] > buyPrice){
                int profit = price[i] - buyPrice;
                maxprofit = Math.max(profit,maxprofit);
            }
            else{
                buyPrice = price[i];
            }
        }
        return maxprofit;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int price[] = new int[n];
        for(int i=0; i<n; i++){
            price[i] = sc.nextInt();
        }
        System.out.println("Maximum profit made by trading after buying and selling stock : "+profit(price));
    }
}
