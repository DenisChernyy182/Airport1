public class TopManager implements Employee {
    private static final int SALARY = 100000;

    private static final int minCompanyIncome = 1_000_000;
    private static final double bonusTopManager = 1.5;

    @Override
    public int getMonthSalary() {
        if (Company.getIncome() + SALARY > minCompanyIncome) {
            return (int) (SALARY * bonusTopManager);
        } else {
            return SALARY;
        }
    }
}
