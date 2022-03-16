package GameOfRoulette;

import java.util.Scanner;

public class FromUser {
        FromUser(String name, int cash){
            this.name = name;
            this.cash = cash;
        }
     private Scanner in = new Scanner(System.in);

   public int intNumber(){
        System.out.println("Please enter the chosen number");
        int intFromUser = in.nextInt();
        return intFromUser;
    }

     private final String name;
     private int cash;
}
