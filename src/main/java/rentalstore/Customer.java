package rentalstore;

import rentalstore.statement_type.HtmlStatement;
import rentalstore.statement_type.Statement;

import java.util.Enumeration;
import java.util.Vector;

public class Customer {
    private String name;
    private Vector rentals = new Vector();

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental arg) {
        rentals.addElement(arg);
    }

    public String getName() {
        return name;
    }

    public String statement() {
        return new Statement().returnResult(this);

    }
    public String htmlStatement() {
        return new HtmlStatement().returnResult(this);

    }

    public void setName(String name) {
        this.name = name;
    }

    public Vector getRentals() {
        return rentals;
    }

    public void setRentals(Vector rentals) {
        this.rentals = rentals;
    }
}
