package GameOfRoulette;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class PlayGame {

    ArrayList<BoxOfNumber> forGame = Sectors.getRandomIntegers();
    BoxOfNumber numberBox = forGame.get((int) (Math.random() * 37));
    Scanner in = new Scanner(System.in);

    // to get a special info about player
    private FromUser getInfo() {
        //the player name
        System.out.println("Please enter your name");
        String name = in.nextLine();

        //the player cash
        System.out.println("Please enter how much money you would like to get");
        int cash = in.nextInt();
        //the player object return
        return new FromUser(name, cash);
    }

    public void StartGame() {
        FromUser user = getInfo();
        System.out.println("Hello " + user.getName() + ", we wish you good game");
        int chosenNum = -1;
        int bidOnCash = 0;
        one:
        while (true) {

            System.out.println("Please enter your chosen number from 0 to 36");
            chosenNum = in.nextInt();

            // check there is chosen number or not
            if (chosenNum < 0 || chosenNum > 36) {
                System.out.println("Sorry, there is not number " + chosenNum + " in this table ");
                continue;
            }

            to:
            while (true) {
                System.out.println("Please enter how much you would like to bid on game");
                bidOnCash = in.nextInt();

               // check the user ivalable to bid so much
                if(bidOnCash > user.checkCash()){
                    System.out.println("Sorry, you have not so much, you have only " + user.checkCash());
                    continue to;
                }else{
                    break to;
                }
            }
            if(chosenNum == numberBox.getNumber()){
                user.counterPlus(bidOnCash * 35);
            }else{
                user.counterMinus(bidOnCash);
                System.out.println("Sorry you lost, the winner number is " + numberBox.getNumber() );
                user.checkUserStatus();
            }
            System.out.println("Your cash is " + user.checkCash() + "\n" + " If you would like to continue put Y, \n " +
                    "if you would like to finish game put F");

            finish:
            while(true) {
                ///!!!!!!!!!!!!!
               String answer = in.nextLine();
                answer = answer.toLowerCase();

                if (answer.equals("y")) {
                    continue one;
                } else if (answer.equals("f")) {
                    System.out.println("Thank you for game, you go out from game with " + user.checkCash() + " $");
                    System.exit(0);
                } else {
                    System.out.println("Sorry I don't know that command");
                }
                continue finish;
            }

        }

    }
}
