package rentalstore.moive_type;

import rentalstore.Rental;

/**
 * @author:QIUHU
 * @description:
 * @date:Create in 7:19 PM 8/27/2018
 * @modified By:
 */
public class ArtType extends  MovieType{
    public double cal(Rental rental) {
        double thisAmount = 0;
        thisAmount+=6;
        if(rental.getDayRented() > 3){
            thisAmount += (rental.getDayRented() -3)*1.5;
        }
        return thisAmount;
    }

    public int calPoint(Rental rental) {

        return 2+rental.getDayRented()*2;
    }
}
