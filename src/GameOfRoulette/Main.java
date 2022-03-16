package GameOfRoulette;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
      ArrayList<BoxOfNumber> forGame = Sectors.getRandomIntegers();
      BoxOfNumber a = forGame.get((int)(Math.random() * 37));




    }
}
