package GameOfRoulette;

public class FromUser {

        FromUser(String name, int cash, int age){
            this.name = name;
            this.cash = cash;
            this.age = age;
        }
    // Check user status
     public void checkUserStatus(){
            if(this.cash == 0){
                System.out.println("You lost all your money");
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
        private int age;
        private int cash;
}
