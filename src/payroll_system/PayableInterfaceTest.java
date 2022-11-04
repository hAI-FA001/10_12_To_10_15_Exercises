package payroll_system;

import payroll_system.abstract_classes.Employee;
import payroll_system.abstract_classes.Payable;
import payroll_system.concrete_classes.*;
import payroll_system.my_util_classes.Date;

public class PayableInterfaceTest {

    public static void main(String[] args) {

        Payable[] payableObjects = new Payable[5];

        payableObjects[0] = new Invoice("01234", "seat", 2, 375.00);
        payableObjects[1] = new Invoice("56789", "tire", 4, 79.95);
        payableObjects[2] = new SalariedEmployee(
                "John", "Smith", "111-11-1111", 800.00,
                new Date(1, 12, 2002)
        );
        payableObjects[3] = new HourlyEmployee(
                "Lisa", "Barnes", "888-88-8888", 12.00, 54,
                new Date(11, 21, 1999)
        );
        payableObjects[4] = new CommissionEmployee(
                "Walter", "White", "999-99-9999", 130, .75,
                new Date(11, 15, 1995)
        );

        System.out.println("Invoices and Employees processed polymorphically:");

        final int currentMonth = 11;
        for (Payable currentPayable : payableObjects) {

            if (currentPayable instanceof BasePlusCommissionEmployee) {

                BasePlusCommissionEmployee basePlusCommissionEmployee = (BasePlusCommissionEmployee) currentPayable;
                basePlusCommissionEmployee.setBaseSalary(
                        basePlusCommissionEmployee.getBaseSalary() + (basePlusCommissionEmployee.getBaseSalary() / 10)
                );
            }

            System.out.printf("%n%s %n%s: $%,.2f%n",
                    currentPayable.toString(), "payment due",
                    currentPayable instanceof Employee
                            && ((Employee) currentPayable).getBirthDate().getMonth() == currentMonth ?
                            (currentPayable.getPaymentAmount() + 100.00) : currentPayable.getPaymentAmount());
        }

    }
}
