public class MonthyCCBalance {
    public static void main(String[] args) {
        double balance = 5000;
        double rate = 0.17/12;

        System.out.println("Interest after one month is " + (balance * rate));
        System.out.println("Interest after two month is " + ((balance * rate) + (balance + balance * rate)));


    }
}
