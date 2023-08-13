public class Manager implements Employee {
    private static final int SALARY = 40000;
    private static final int MIN_AMOUNT_OF_MONEY = 115000;
    private static final int MAX_AMOUNT_OF_MONEY  = 140000;
    private static final double BONUS_MANAGER = 0.5;
    private final int companySalary;

    public Manager() {
        this.companySalary = MIN_AMOUNT_OF_MONEY + (int) (Math.random() * MAX_AMOUNT_OF_MONEY);
    }

    public int getMonthSalary() {
        return SALARY + (int) (companySalary * BONUS_MANAGER);
    }
}
