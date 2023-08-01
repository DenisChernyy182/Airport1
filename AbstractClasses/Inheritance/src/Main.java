public class Main {
    public static void main (String[] args) {
        Company company = new Company();
        Company company2 = new Company();

        hire(company);
        hire(company2);
        System.out.println("Первая компания");
        company.print();
        System.out.println("Вторая компания");
        company2.print();
        fireEmployees2(company);
        fireEmployees2(company2);
        System.out.println("Первая компания");
        company.print();
        System.out.println("Вторая компания");
        company2.print();

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
    public static void fireEmployees2(Company company) {
        int countEmployees = company.getSize();
        for (int i = 0; i < countEmployees * 0.3; i++) {
            int index = (int) (Math.random() * company.getSize());
            Employee dismissed = company.getEmployee().get(index);
            company.fire(dismissed);
        }
    }
    public static void printLowest (Company company){
        System.out.println("Самые низкие зарплаты: ");
        for (Employee employee : company.getLowestSalaryStaff(30)) {
            System.out.println(employee.getMonthSalary());
        }
    }

    public static void printHighest (Company company){
        System.out.println("Самые высокие зарплаты: ");
        for (Employee employee : company.getTopSalaryStaff(10)) {
            System.out.println(employee.getMonthSalary());
        }
    }

}
