package rentalstore.statement_type;

import rentalstore.Customer;
import rentalstore.Rental;

/**
 * @author:QIUHU
 * @description:
 * @date:Create in 6:34 PM 8/27/2018
 * @modified By:
 */
public class Statement extends StatementModel {
    public String printHead(Customer customer) {
        return "Rental Record for " + customer.getName() + "\n";
    }

    public String printFoot(double totalAmount, int frequentRenterPoints, String result) {
        result += "Amount owed is" + String.valueOf(totalAmount) + "\n";
        result += "You earned" + String.valueOf(frequentRenterPoints) + " frequent renter points";
        return result;
    }
    public String printContent(String result, double thisAmount, Rental each) {
        result += "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(thisAmount) + "\n";
        return result;
    }
}
