package GameOfRoulette;

import java.util.Scanner;

public class FromUser {

        FromUser(String name, int cash){
            this.name = name;
            this.cash = cash;
        }

     public void checkUserStatus(){
            if(this.cash == 0){
                System.out.println("You had lost all your money");
                System.exit(0);
            }
     }

    //to check the user available to bid so much cash
     public boolean checkCash(int forCheckBidStatus){
            if(this.cash < forCheckBidStatus){
                System.out.println("Sorry, but you have no so much money");
                return false;
            }
            return true;
     }

    // to add the win money
    public void counterPlus(int cash){
            this.cash += cash;
    }

    //to pull off the lost money
    public void counterMinus(int cash){
            this.cash -= cash;
    }

     private final String name;
     private int cash;
}
