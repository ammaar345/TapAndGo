package tapAndGo;

public class Main {
    public static void main(String[] args) throws Exception {
        TapAndGo tapAndGo = new TapAndGo(2,1000);

//        tapAndGo.deposit(2000);
        tapAndGo.pay(1000);
        System.out.println(tapAndGo.getBalance());
    }
}
