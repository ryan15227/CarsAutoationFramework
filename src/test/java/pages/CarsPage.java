package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class CarsPage {

    public CarsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[@class='nav-user-name'][1]")
    public WebElement menuButton;


    @FindBy(xpath = "//ul[@class='header-links']//li[@class='header-link']")
    public List<WebElement> headerButtons;


    @FindBy(xpath = "//li[@class='profile-link']")
    public List<WebElement> menuButtons;








}
