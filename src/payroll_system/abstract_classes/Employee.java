package payroll_system.abstract_classes;

import payroll_system.my_util_classes.Date;

public abstract class Employee  implements Payable{
    private final String firstName, lastName, socialSecurityNumber;
    private final Date birthDate;

    public Employee(String firstName, String lastName, String socialSecurityNumber, Date birthDate){

        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.birthDate = birthDate;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getSocialSecurityNumber(){
        return socialSecurityNumber;
    }

    public Date getBirthDate(){
        return birthDate;
    }

    @Override
    public String toString(){
        return String.format("%s %s%nsocial security number: %s",
                getFirstName(), getLastName(), getSocialSecurityNumber());
    }
}
