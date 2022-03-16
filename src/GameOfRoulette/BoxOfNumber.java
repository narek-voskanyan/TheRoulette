package GameOfRoulette;

public class BoxOfNumber {
    BoxOfNumber(int number, String quickBets, String color){
        this.number = number;
        this.quickBets = quickBets;
        this.color = color;
    }

    public int getNumber(){
        return this.number;
    }
    //The color will come soon...
    public String getColor(){
        return this.color;
    }

    private final  int number;
    private final String quickBets;
    private final String color;
}