package rentalstore;

import java.util.Enumeration;
import java.util.Vector;

public class Customer {
    private String name;
    private Vector rentals = new Vector();

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental arg){
        rentals.addElement(arg);
    }

    public String getName() {
        return name;
    }

    public String statement(){
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        Enumeration rentals = this.rentals.elements();
        String result = "Rental Record for " + getName() + "\n";
        while(rentals.hasMoreElements()){
            double thisAmount =0;
            Rental each = (Rental) rentals.nextElement();

            thisAmount+=each.getMovie().getType().cal(each);

            //add frequent renter points
            frequentRenterPoints ++;
            //add bonus for a two day new release rental
            if(isNewRelease(each) && each.getDayRented() > 1){
                frequentRenterPoints ++;
            }
            //show figures for this rental
            result += "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(thisAmount) + "\n";
            totalAmount += thisAmount;
        }
        //add footer lines
        result = printTotalAmount(totalAmount, result);
        result = printEarnedPoint(frequentRenterPoints, result);
        return result;
    }

    private boolean isNewRelease(Rental each) {
        return each.getMovie().getPriceCode() == Movie.NEW_RELEASE;
    }

    private String printEarnedPoint(int frequentRenterPoints, String result) {
        result += "You earned" + String.valueOf(frequentRenterPoints) + " frequent renter points";
        return result;
    }

    private String printTotalAmount(double totalAmount, String result) {
        result += "Amount owed is" + String.valueOf(totalAmount) + "\n";
        return result;
    }
}
