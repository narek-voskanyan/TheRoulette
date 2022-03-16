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

     public boolean checkCash(int forCheckBidStatus){
            if(this.cash < forCheckBidStatus){
                System.out.println("Sorry, but you have no so much money");
                return false;
            }
            return true;
     }

    public void counterPlus(int cash){
            this.cash += cash;
    }

    public void counterMinus(int cash){
            this.cash -= cash;
    }

     private final String name;
     private int cash;
}
