package GameOfRoulette;

public class BoxOfNumber {
    BoxOfNumber(int number, String quickBets, String color){
        this.number = number;
        this.quickBets = quickBets;
        this.color = color;
    }

    private final  int number;
    private final String quickBets;
    private final String color;

    public int getNumber(){
        return this.number;
    }
}

/*
class VoisinsDeZero{

    private final int[] quickBetsBox = {22, 18, 29, 7, 28, 12, 35, 3, 26, 0, 32, 15, 19, 4, 21, 2, 25};
}
*/