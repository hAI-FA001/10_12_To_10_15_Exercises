package payroll_system;

import payroll_system.abstract_classes.Employee;
import payroll_system.concrete_classes.*;
import payroll_system.my_util_classes.Date;


public class PayrollSystemTest {

    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        employees[0] = new SalariedEmployee("John", "Smith", "111-11-1111",
                800.00, new Date(1,1,1999));

        employees[1] = new HourlyEmployee("Karen", "Price", "222-22-2222",
                16.75, 40, new Date(10, 23, 1991));

        employees[2] = new CommissionEmployee("Sue", "Jones", "333-33-3333",
                10000, .06, new Date(12, 11, 2000));

        employees[3] = new BasePlusCommissionEmployee("Bob", "Lewis", "444-44-4444",
                5000, .04, 300, new Date(7, 5, 2001));

        employees[4] = new PieceWorker("Ezra", "Miles", "555-55-5555", 10, 20,
                new Date(7, 7, 2001));

        System.out.printf("Employees processed polymorphically:%n%n");

        for(Employee currentEmployee : employees) {
            System.out.println(currentEmployee);
            System.out.println();
        }
    }
}
