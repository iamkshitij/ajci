import java.util.ArrayList;

public class ChangeMachine {
    public static void main(String[] args) {
        int amount = 1;
        System.out.println(amount + " --> " + getMinCoins(amount)); 

        amount = 17;
        System.out.println(amount + " --> " + getMinCoins(amount));   
        
        amount = 33;
        System.out.println(amount + " --> " + getMinCoins(amount)); 

        amount = 99;
        System.out.println(amount + " --> " + getMinCoins(amount));     
    }

    public static int[] coins = {25, 10, 5, 1};

    public static ArrayList<Integer> getMinCoins(int amount){
        ArrayList<Integer> change = new ArrayList<>();

        for (int i = 0; i < coins.length && amount > 0; i++) {
            while(amount >= coins[i]){
                amount = amount - coins[i];
                change.add(coins[i]);
            }
        }

        return change;
    }
}
