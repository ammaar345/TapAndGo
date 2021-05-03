package tapAndGo;

public class Main {
    public static void main(String[] args) throws Exception {
        TapAndGo tapAndGo = new TapAndGo(20010,1000);

//        tapAndGo.deposit(2000);
        tapAndGo.pay(3000);
        System.out.println(tapAndGo.getBalance());
    }
}
