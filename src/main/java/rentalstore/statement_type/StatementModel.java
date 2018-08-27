package rentalstore.statement_type;

import rentalstore.Customer;
import rentalstore.Movie;
import rentalstore.Rental;

import java.util.Enumeration;

/**
 * @author:QIUHU
 * @description:
 * @date:Create in 6:33 PM 8/27/2018
 * @modified By:
 */
public abstract class StatementModel {

    public String returnResult(Customer customer) {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        Enumeration rentals = customer.getRentals().elements();
//        String result = "Rental Record for " + customer.getName() + "\n";
        String result = printHead(customer);
        while (rentals.hasMoreElements()) {
            double thisAmount = 0;
            Rental each = (Rental) rentals.nextElement();

            thisAmount += each.getMovie().getType().cal(each);
            frequentRenterPoints+=each.getMovie().getType().calPoint(each);
            //add frequent renter points
//            frequentRenterPoints++;
//            frequentRenterPoints = each.getMovie().getType().calPoint(each);
            //add bonus for a two day new release rental
//            if (each.getMovie().getPriceCode() == Movie.NEW_RELEASE && each.getDayRented() > 1) {
//                frequentRenterPoints++;
//            }
            //show figures for this rental
            result = printContent(result, thisAmount, each);
            totalAmount += thisAmount;
        }
        //add footer lines
        result = printFoot(totalAmount, frequentRenterPoints, result);
        return result;
    }

    abstract String printContent(String result, double thisAmount, Rental each);

    public abstract String printFoot(double totalAmount, int frequentRenterPoints, String result);

    public abstract String printHead(Customer customer);
}
