public class Manager implements Employee {
    private static final int SALARY = 40000;
    private static final int minAmountOfMoney = 115000;
    private static final int maxAmountOfMoney = 140000;
    private static final double bonusManager = 0.5;
    private final int companySalary;

    public Manager() {
        this.companySalary = minAmountOfMoney + (int) (Math.random() * maxAmountOfMoney);
    }

    @Override
    public int getMonthSalary() {
        return SALARY + (int) (companySalary * bonusManager);
    }
}
