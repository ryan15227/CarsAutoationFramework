package utilities;

import pages.CarsPage;
import pages.FindYourMatchPage;

public class Pages {

    private CarsPage carsPage;
    private FindYourMatchPage findYourMatchPage;

    public Pages() {
        this.carsPage = new CarsPage();
        this.findYourMatchPage = new FindYourMatchPage();
    }

    public CarsPage getCarsPage() {
        return carsPage;
    }

    public FindYourMatchPage getFindYourMatchPage() {
        return findYourMatchPage;
    }

}
