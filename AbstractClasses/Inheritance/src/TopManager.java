public class TopManager implements Employee {
    private static final int SALARY = 100000;
    private static final int MIN_COMPANY_INCOME = 1_000_000;
    private static final double BONUS_TOP_MANAGER = 1.5;

    public TopManager () {
        Company salary = new Company();
    }

    @Override
    public int getMonthSalary() {
        if (TopManager.SALARY > MIN_COMPANY_INCOME) {
            return (int) (SALARY * BONUS_TOP_MANAGER);
        } else {
            return SALARY;
        }
    }
}
