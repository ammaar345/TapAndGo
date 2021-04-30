package tapAndGo;

public class TapAndGo {
    //static variables are shared by a class , while not static , values are not shared between instances.
    double balance;
    //    double newBalance;
    double threshold;

    TapAndGo(double balance, double threshold) {
        this.balance = balance;//setting balance
        this.threshold = threshold;//setting threshold for tap and go
    }


    public void pay(double payAmount) throws Exception {
        try {
            if (payAmount < threshold) {
                balance = balance - payAmount; //subtracting payment from your balance

            } else {
                throw new Exception("bread");
            }
        } catch (Exception e) {
            System.out.println("You are exceeding the tap and go limit for your card.");
        }

    }

    public void deposit(double depositAmount) {
        balance += depositAmount;//increase balance when you deposit money

    }

    public double getBalance() {

        return balance;
        //tell us the balance we have in our account

    }
}
