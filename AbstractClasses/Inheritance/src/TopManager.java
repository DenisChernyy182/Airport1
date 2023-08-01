public class TopManager implements Employee {
    private static final int SALARY = 100000;
    @Override
    public int getMonthSalary() {
        if(Company.getIncome() + SALARY > 10000000) {
            return (int) (SALARY * 1.5);
        }
        else {
            return SALARY;
        }
    }
}
