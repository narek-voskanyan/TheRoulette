package GameOfRoulette;

import java.util.ArrayList;

public class PlayGame {
    ArrayList<BoxOfNumber> forGame = Sectors.getRandomIntegers();
    BoxOfNumber a = forGame.get((int)(Math.random() * 37));

}
