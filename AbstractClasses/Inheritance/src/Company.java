import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Company {
    protected static int income;

    private static final ArrayList<Employee> employee = new ArrayList<>();

    public List<Employee> getEmployee() {
        return employee;
    }

    public void print() {
        for (Employee employee : getEmployee()) {
            System.out.println(employee.getMonthSalary());
        }
    }

    public int getSize() {
        return employee.size();
    }

    public void setIncome(int income) {
        Company.income = income;
    }

    public static double getIncome() {
        return Company.income;
    }

    public Company() {
        new ArrayList<String>();
        setIncome(income);
    }

    public ArrayList<Employee> hireAll (Employee employee, int count) {
        for (int i = 0; i < count; i++) {
            Company.employee.add(employee);
        }
        return Company.employee;
    }

    public void hire(Employee employee) {
        Company.employee.add(employee);
    }

    public void fire(Employee employee) {
        Company.employee.remove(employee);
    }

    public List<Employee> getTopSalaryStaff(int count) {
        List<Employee> highestSalary = new ArrayList<>(employee);
        highestSalary.sort(Comparator.comparing(Employee::getMonthSalary).reversed());
        return highestSalary.subList(0, count);
    }

    public List<Employee> getLowestSalaryStaff(int count) {
        List<Employee> lowestSalary = new ArrayList<>(employee);
        lowestSalary.sort(Comparator.comparing(Employee::getMonthSalary));
        return lowestSalary.subList(0, count);
    }
}
