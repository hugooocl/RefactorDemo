package rentalstore;

/**
 * @author:QIUHU
 * @description:
 * @date:Create in 4:06 PM 8/26/2018
 * @modified By:
 */
public class RegularMovie extends MovieType {
    double cal(Rental rental) {
        double thisAmount = 0;
        thisAmount += 2;
                    if(rental.getDayRented() > 2){
                        thisAmount+=(rental.getDayRented() - 2) * 1.5;
                    }
        return thisAmount;
    }
}
