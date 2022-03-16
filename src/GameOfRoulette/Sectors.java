package GameOfRoulette;

import java.util.ArrayList;

public class Sectors {

    public static ArrayList<BoxOfNumber>  addIntegers(){
        ArrayList<BoxOfNumber> allNumbers = new ArrayList<BoxOfNumber>(37);
        allNumbers.add(new BoxOfNumber(22, "Voisins de zero", "black"));
        allNumbers.add(new BoxOfNumber(18, "Voisins de zero", "red"));
        allNumbers.add(new BoxOfNumber(29, "Voisins de zero", "black"));
        allNumbers.add(new BoxOfNumber(7, "Voisins de zero", "red"));
        allNumbers.add(new BoxOfNumber(28, "Voisins de zero", "black"));
        allNumbers.add(new BoxOfNumber(12, "Voisins de zero", "red"));
        allNumbers.add(new BoxOfNumber(35, "Voisins de zero", "black"));
        allNumbers.add(new BoxOfNumber(3, "Voisins de zero", "red"));
        allNumbers.add(new BoxOfNumber(26, "Voisins de zero", "black"));
        allNumbers.add(new BoxOfNumber(0, "Voisins de zero", "green"));
        allNumbers.add(new BoxOfNumber(32, "Voisins de zero", "red"));
        allNumbers.add(new BoxOfNumber(15, "Voisins de zero", "black"));
        allNumbers.add(new BoxOfNumber(19, "Voisins de zero", "red"));
        allNumbers.add(new BoxOfNumber(4, "Voisins de zero", "black"));
        allNumbers.add(new BoxOfNumber(21, "Voisins de zero", "red"));
        allNumbers.add(new BoxOfNumber(2, "Voisins de zero", "black"));
        allNumbers.add(new BoxOfNumber(25, "Voisins de zero", "red"));
        allNumbers.add(new BoxOfNumber(17, "Orphelins", "black"));
        allNumbers.add(new BoxOfNumber(34, "Orphelins", "red"));
        allNumbers.add(new BoxOfNumber(6, "Orphelins", "black"));
        allNumbers.add(new BoxOfNumber(27, "Tier", "red"));
        allNumbers.add(new BoxOfNumber(13, "Tier", "black"));
        allNumbers.add(new BoxOfNumber(36, "Tier", "red"));
        allNumbers.add(new BoxOfNumber(11, "Tier", "black"));
        allNumbers.add(new BoxOfNumber(30, "Tier", "red"));
        allNumbers.add(new BoxOfNumber(8, "Tier", "black"));
        allNumbers.add(new BoxOfNumber(23, "Tier", "red"));
        allNumbers.add(new BoxOfNumber(10, "Tier", "black"));
        allNumbers.add(new BoxOfNumber(5, "Tier", "red"));
        allNumbers.add(new BoxOfNumber(24, "Tier", "black"));
        allNumbers.add(new BoxOfNumber(16, "Tier", "red"));
        allNumbers.add(new BoxOfNumber(33, "Tier", "black"));
        allNumbers.add(new BoxOfNumber(1, "Orphelins", "red"));
        allNumbers.add(new BoxOfNumber(20, "Orphelins", "black"));
        allNumbers.add(new BoxOfNumber(14, "Orphelins", "red"));
        allNumbers.add(new BoxOfNumber(31, "Orphelins", "black"));
        allNumbers.add(new BoxOfNumber(9, "Orphelins", "red"));

        return allNumbers;
    }


}
