package GameOfRoulette;

import java.util.Scanner;

public class FromUser {

        FromUser(String name, int cash){
            this.name = name;
            this.cash = cash;
        }

     public void checkCash(){
            if(this.cash == 0){
                System.out.println("You had lost all your money");
                System.exit(0);
            }
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
