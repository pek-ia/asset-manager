public class Gold extends FixedAsset {
    private double weightInTroyOunces;

    public Gold(String name, double marketValue, double weightInTroyOunces) {
        super(name, marketValue);
        this.weightInTroyOunces = weightInTroyOunces;
    }

    @Override
    public double getValue() {
        return weightInTroyOunces * 2700.0;
    }
}
