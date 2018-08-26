package rentalstore;

/**
 * @author:QIUHU
 * @description:
 * @date:Create in 3:43 PM 8/26/2018
 * @modified By:
 */
public class ChildrensType extends MovieType {
    double cal(Rental rental) {
        double thisAmount = 0;
        thisAmount+=1.5;
        if(rental.getDayRented() > 3){
            thisAmount += (rental.getDayRented() -3)*1.5;
        }
        return thisAmount;
    }
}
