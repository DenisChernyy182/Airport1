import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Company {
    private int income;

    private final ArrayList<Employee> listEmployees = new ArrayList<>();

    public List<Employee> getEmployee() {
        return listEmployees;
    }

    public void print() {
        for (Employee employee : getEmployee()) {
            System.out.println(employee.getMonthSalary());
        }
    }

    public int getSize() {
        return listEmployees.size();
    }

    public void setIncome(int income) {
        this.income = income;
    }

    public double getIncome() {
        return this.income;
    }

    public Company() {
        setIncome(income);
    }

    public ArrayList<Employee> hireAll (Employee employee, int count) {
        for (int i = 0; i < count; i++) {
            this.listEmployees.add(employee);
        }
        return this.listEmployees;
    }

    public void hire(Employee employee) {
        this.listEmployees.add(employee);
    }

    public List<Employee> getTopSalaryStaff(int count) {
        List<Employee> highestSalary = new ArrayList<>(listEmployees);
        highestSalary.sort(Comparator.comparing(Employee::getMonthSalary).reversed());
        return highestSalary.subList(0, count);
    }

    public List<Employee> getLowestSalaryStaff(int count) {
        List<Employee> lowestSalary = new ArrayList<>(listEmployees);
        lowestSalary.sort(Comparator.comparing(Employee::getMonthSalary));
        return lowestSalary.subList(0, count);
    }
}
