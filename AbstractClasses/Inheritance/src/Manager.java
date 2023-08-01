public class Manager implements Employee {
    private static final int SALARY = 40000;
    private final int companySalary;


    public Manager() {
        this.companySalary = (int) (Math.random() * 25000) + 115000;
    }

    @Override
    public int getMonthSalary() {
        return SALARY + (int) (companySalary * 0.5);
    }
}
