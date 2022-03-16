package GameOfRoulette;

public class FromUser {

        FromUser(String name, int cash){
            this.name = name;
            this.cash = cash;
        }
    // Check user status
     public void checkUserStatus(){
            if(this.cash == 0){
                System.out.println("You had lost all your money");
                System.exit(0);
            }
     }

    //to check the user available to bid so much cash
     public int checkCash(){
            return this.cash;
     }

    // to add the win money
    public void counterPlus(int cash){
            this.cash += cash;
    }

    //to pull off the lost money
    public void counterMinus(int cash){
            this.cash -= cash;
    }
     public String getName(){
            return this.name;
     }
     private final String name;
     private int cash;
}
