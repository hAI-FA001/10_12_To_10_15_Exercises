package payroll_system.concrete_classes;

import payroll_system.abstract_classes.Employee;
import payroll_system.my_util_classes.Date;

public class PieceWorker extends Employee {

    private double wage;
    private int pieces;

    public PieceWorker(String firstName, String lastName, String socialSecurityNumber, int wage, int pieces,
                       Date birthDate){
        super(firstName, lastName, socialSecurityNumber, birthDate);

        if(wage <= 0.0 )
            throw new IllegalArgumentException("Wage must be > 0.0");

        if(pieces < 0)
            throw new IllegalArgumentException("Pieces must be >= 0");

        this.wage = wage;
        this.pieces = pieces;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {

        if(wage <= 0.0 )
            throw new IllegalArgumentException("Wage must be > 0.0");

        this.wage = wage;
    }

    public int getPieces() {
        return pieces;
    }

    public void setPieces(int pieces) {

        if(pieces < 0)
            throw new IllegalArgumentException("Pieces must be >= 0");

        this.pieces = pieces;
    }


    @Override
    public double getPaymentAmount() {
        return wage * pieces;
    }

    @Override
    public String toString(){
        return String.format("piece worker employee: %s%n%s: $%,.2f; %s: %d",
                super.toString(), "wage per piece", getWage(), "number of pieces", getPieces());
    }
}
