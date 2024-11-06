public class BankAccount implements Valuable {
    private double balance;

    @Override
    public double getValue() {
        return balance;
    }
}
