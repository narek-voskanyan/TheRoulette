package GameOfRoulette;

import java.util.Scanner;

public class FromUser {

   private static  Scanner in = new Scanner(System.in);
    public static int intNumber(){
        System.out.println("Please enter the chosen number");
        int intFromUser = in.nextInt();
        return intFromUser;
    }
}
