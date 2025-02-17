import java.util.*;
public class Indian_Coins {
    public static void main(String args[]){
        Integer coins[] = {1,2,5,10,20,50,100,500,2000};

        //sort in descending
        Arrays.sort(coins, Comparator.reverseOrder());
        int count_coins = 0;
        int amount = 795;

        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0; i<coins.length; i++){
            if(coins[i] <= amount){
                while(coins[i] <= amount){
                    count_coins++;
                    arr.add(coins[i]);
                    amount -= coins[i];
                }
            }
        }

        System.out.println("Minimum coins used for exchange : " + count_coins);
        System.out.println("Coins are -");
        for(int i=0; i<arr.size(); i++){
            System.out.print( arr.get(i) +" ");
        }
        System.out.println();
    }
}
