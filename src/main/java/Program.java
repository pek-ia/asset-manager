public class Program {
    public static void main(String[] args) {
        Portfolio p = new Portfolio();

        p.addAsset(new Gold("Krugerrand", 1350, .5));
        p.addAsset(new BankAccount());
    }
}
