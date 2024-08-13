import java.util.*;
public class Practice__Buy__Sell {
    public static void main(String args[]){
        int buy[] = {5,4,8,6,2,6,8,9};

        //buy sell algorithm
        int buyprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for(int i=0; i<buy.length; i++){
            if(buyprice < buy[i]){
                int profit = buy[i] - buyprice;
                maxprofit = Math.max(profit , maxprofit);
            } else {
                buyprice = buy[i];
            }
        }

        System.out.println("Maximum profit obtained -> " + buyprice);
    }
}
