package rentalstore.statement_type;

import rentalstore.Customer;
import rentalstore.Rental;

/**
 * @author:QIUHU
 * @description:
 * @date:Create in 6:34 PM 8/27/2018
 * @modified By:
 */
public class HtmlStatement extends StatementModel{
    public String printFoot(double totalAmount, int frequentRenterPoints, String result) {
        result += "<p>Amount owed is" + String.valueOf(totalAmount) + "<p>\n";
//<P>You owe<EM>3.0</EM><P>
        result += "<P>You earned<EM>" + String.valueOf(frequentRenterPoints) + "</EM><P>";
        return result;
    }

    public String printHead(Customer customer) {
        return "<H1>Rental Record for <EM>" + customer.getName() + "</EM></H1>\n";
    }
    public String printContent(String result, double thisAmount, Rental each) {
        result += "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(thisAmount) +"<BR>"+ "\n";
        return result;
    }
}
