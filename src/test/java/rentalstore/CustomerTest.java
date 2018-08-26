package rentalstore;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author:QIUHU
 * @description:
 * @date:Create in 2:36 PM 8/26/2018
 * @modified By:
 */
public class CustomerTest {
    Customer customer;
    @Before
    public void init (){
        customer = new Customer("hugo");
    }
    @Test
    public void should_return_current_statement_when_movie_price_code_1_and_dayRented_10(){
        Movie m = new Movie("movie1",1);
        customer.addRental(new Rental(m,10));
        Assert.assertEquals("Rental Record for hugo\n" +
                "\tmovie1\t30.0\n" +
                "Amount owed is30.0\n" +
                "You earned2 frequent renter points",customer.statement());
    }

    @Test
    public void should_return_current_statement_when_movie_price_code_2_and_dayRented_100(){
        Movie m = new Movie("movie1",2);
        customer.addRental(new Rental(m,100));
        Assert.assertEquals("Rental Record for hugo\n" +
                "\tmovie1\t147.0\n" +
                "Amount owed is147.0\n" +
                "You earned1 frequent renter points",customer.statement());
    }
    @Test
    public void should_return_current_statement_when_movie_price_code_0_and_dayRented_1000(){
        Movie m = new Movie("movie1",0);
        customer.addRental(new Rental(m,1000));
        Assert.assertEquals("Rental Record for hugo\n" +
                "\tmovie1\t1499.0\n" +
                "Amount owed is1499.0\n" +
                "You earned1 frequent renter points",customer.statement());
    }

    @Test
    public void should_return_current_price_code_when_change_the_price_code(){
        Movie m = new Movie("movie2",1);
        m.setPriceCode(2);
        Assert.assertEquals(2,m.getPriceCode());
    }
}
