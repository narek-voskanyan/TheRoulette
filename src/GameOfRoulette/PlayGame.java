package GameOfRoulette;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class PlayGame {

   private final ArrayList<BoxOfNumber> forGame = Sectors.getRandomIntegers();
    BoxOfNumber numberBox;
    Scanner in = new Scanner(System.in);

    // to get a special info about player
    private FromUser getInfo() {
        //the player name
        System.out.println("Please enter your name");
        String name = in.nextLine();

        //Check the user age
        System.out.println("Please enter your age");
        int age = in.nextInt();
        if(age <= 21){
            System.out.println("Sorry, but you are so young. Come back when you grow up.");
            System.exit(0);
        }

        //the player cash
        System.out.println("Please enter how much money you would like to get");
        int cash = in.nextInt();

        //the player object return
        return new FromUser(name, cash, age);
    }

    public void StartGame() {
        FromUser user = getInfo();
        System.out.println("Hello, " + user.getName() + ":\n We wish you good game \n" +
                "---------THE GAME IS STARTING---------");
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

            // to get a random box object
            numberBox = forGame.get((int) (Math.random() * 37));

            // to start a game
            if(chosenNum == numberBox.getNumber()){
                // the player win
                user.counterPlus(bidOnCash * 35);
                System.out.println("CONGRATULATIONS YOU WIN  " + (bidOnCash * 35) +
                        " $ : your cash now is " + user.checkCash() + " $");
            }else{
                //the player loss
                user.counterMinus(bidOnCash);
                System.out.println("Sorry you lost, the winner number is " + numberBox.getNumber() );
                user.checkUserStatus();
            }
            System.out.println("Your cash is " + user.checkCash() + "\n" + " If you would like to continue put Y, \n " +
                    "if you would like to finish game put N");

            finish:
            while(true) {
                ///!!!!!!!!!!!!!
               String answer = in.next();
                answer = answer.toLowerCase();
                // if user want to continue
                if (answer.equals("y")) {
                    System.out.println("---------GOOD LUCK---------");
                    continue one;
                // if user want finish game
                } else if (answer.equals("n")) {
                    System.out.println("Thank you for game, you go out from game with " + user.checkCash() + " $");
                    System.exit(0);
                    // the false command from user
                } else {
                    System.out.println("Sorry I don't know that command");
                    continue finish;
                }

            }

        }

    }

}
