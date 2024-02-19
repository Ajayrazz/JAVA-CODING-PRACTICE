import java.util.*;
public class Practice_BuyAndSell_Stock {
    public static int buysell(int price[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i=0; i<price.length; i++){
            if(buyPrice < price[i]){
                maxProfit = price[i] - buyPrice;
            }
            else{
                buyPrice = price[i];
            }
        }
        return maxProfit;
    }
    public static void main(String args[]){
        int price[] = {9,8,5,3,4,7,1};
        System.out.println("Max profit : "+buysell(price));
    }
}
