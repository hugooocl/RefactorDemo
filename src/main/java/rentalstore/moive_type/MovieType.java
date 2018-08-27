package rentalstore.moive_type;

import rentalstore.Rental;

/**
 * @author:QIUHU
 * @description:
 * @date:Create in 3:55 PM 8/26/2018
 * @modified By:
 */
public abstract class MovieType {
    public abstract double cal(Rental rental);
    public abstract int calPoint(Rental rental);
}
