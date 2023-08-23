import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Company company = new Company();
        hire(company);
//        System.out.println("Заработная плата работников компании:");
//        company.print();
        printLowest(company);
        printHighest(company);
        fireEmployees(company);
        printHighestFired(company);
        printLowestFired(company);

    }

    public static void hire (Company company) {
        int sumOperator = 0;
        for (int i = 0; i < 180; i++) {
            Employee operator = new Operator();
            company.hire(operator);
            int q = (int) Math.pow(i, 2);
            sumOperator++;
        }
        System.out.println("Колличество Operators: " + sumOperator + " чел.");

        int sumManager = 0;
        for (int i = 0; i < 80; i++) {
            Employee manager = new Manager();
            company.hire(manager);
            sumManager++;
        }
        System.out.println("Колличество Managers: " + sumManager + " чел.");

        int sumTopManager = 0;
        for (int i = 0; i < 10; i++) {
            Employee topManager = new TopManager(company);
            company.hire(topManager);
            sumTopManager++;
        }
        System.out.println("Колличество Top Managers: " + sumTopManager + " чел.");
    }


    public static void printLowest(Company company) {
        System.out.println("Самые низкие зарплаты: ");
        for (Employee ignored : company.getLowestSalaryStaff(30)) {
            System.out.println(ignored.getMonthSalary());
        }
    }

    public static void printHighest(Company company) {
        System.out.println("Самые высокие зарплаты: ");
        for (Employee employee : company.getTopSalaryStaff(11)) {
            System.out.println(employee.getMonthSalary());
        }
    }

    public static void fireEmployees(Company company) {
        System.out.println("Уволили 50% работников");
        int countEmployees = company.getSize();
        for (int i = 0; i < countEmployees / 2; i++) {
            int index = (int) (Math.random() * company.getSize());
            Employee dismissed = company.getEmployee().get(index);
            company.hire(dismissed);
        }
    }

    public static void printLowestFired(Company company) {
        System.out.println("Самые низкие зарплаты после увольнения 50% работников: ");
        for (Employee ignored : company.getLowestSalaryStaff(30)) {
            System.out.println(ignored.getMonthSalary());
        }
    }

    public static void printHighestFired(Company company) {
        System.out.println("Самые высокие зарплаты после увольнения 50% работников: ");
        for (Employee employee : company.getTopSalaryStaff(11)) {
            System.out.println(employee.getMonthSalary());
        }
    }

}
