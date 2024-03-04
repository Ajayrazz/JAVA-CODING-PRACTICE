import java.util.*;
public class Indian_Coins_Algorithm {
    public static void main(String args[]){
        Integer coins[] = {1,2,5,10,20,50,100,500,2000};
        int amount = 981;

        //sort coins in descending
        Arrays.sort(coins , Comparator.reverseOrder());
        int countofcoin = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=0; i<coins.length; i++){
            if(coins[i] <= amount){
                while(coins[i] <= amount){
                    countofcoin++;
                    ans.add(coins[i]);
                    amount -= coins[i];
                }
            }
        }
        System.out.println("Total coin used = "+countofcoin);

        for(int i=0; i<ans.size(); i++){
            System.out.print(ans.get(i)+" ");
        }
        System.out.println();
    }
}
