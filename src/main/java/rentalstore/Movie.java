package rentalstore;

import rentalstore.moive_type.*;

public class Movie {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    public static final int ART = 3;
    private MovieType type;
    private String title;
    private int priceCode;


    public Movie(String title, int priceCode) {
        this.title = title;
        this.priceCode = priceCode;
        if (priceCode == 2) {
            type = new ChildrensType();
        }
        if (priceCode == 1) {
            type = new NewReleaseType();
        }
        if (priceCode == 0) {
            type = new RegularType();
        }
        if (priceCode == 3) {
            type = new ArtType();
        }
    }

    public int getPriceCode() {
        return priceCode;
    }

    public void setPriceCode(int priceCode) {
        this.priceCode = priceCode;
    }

    public String getTitle() {
        return title;
    }

    public MovieType getType() {
        return type;
    }

    public void setType(MovieType type) {
        this.type = type;
    }
}
