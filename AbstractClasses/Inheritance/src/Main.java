public class Main {
    public static void main(String[] args) {
        Company company = new Company();

        hire(company);
        System.out.println("Заработная лата работников компании:");
        company.print();
        printLowest(company);
        printHighest(company);

    }

    public static void hire(Company company) {
        for (int i = 0; i < 10; i++) {
            Employee operator = new Operator();
            company.hire(operator);
        }
        for (int i = 0; i < 5; i++) {
            Employee manager = new Manager();
            company.hire(manager);
        }
        for (int i = 0; i < 3; i++) {
            Employee topManager = new TopManager();
            company.hire(topManager);
        }
    }

    public static void printLowest(Company company) {
        System.out.println("Самые низкие зарплаты: ");
        for (Employee employee : company.getLowestSalaryStaff(5)) {
            System.out.println(employee.getMonthSalary());
        }
    }

    public static void printHighest(Company company) {
        System.out.println("Самые высокие зарплаты: ");
        for (Employee employee : company.getTopSalaryStaff(5)) {
            System.out.println(employee.getMonthSalary());
        }
    }

}
