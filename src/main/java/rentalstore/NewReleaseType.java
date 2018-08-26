package rentalstore;

/**
 * @author:QIUHU
 * @description:
 * @date:Create in 4:05 PM 8/26/2018
 * @modified By:
 */
public class NewReleaseType extends MovieType {
    double cal(Rental rental) {
        double thisAmount = 0;
        thisAmount += rental.getDayRented() * 3;
        return thisAmount;
    }
}
