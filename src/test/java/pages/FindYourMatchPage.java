package pages;

import io.cucumber.java.eo.Se;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import utilities.BrowserUtils;
import utilities.FindYourMatchSelection;

import java.util.List;

public class FindYourMatchPage extends CarsPage{

    BrowserUtils utils = new BrowserUtils();

    @FindBy(xpath = "//div[@id='by-make-tab']//*[contains(@class,'sds-field sds-home-search__')]")
    private List<WebElement> makeElements;

    @FindBy(xpath = "//div[@id='by-make-tab']//*[contains(@class,'sds-field sds-home-search__type')]//option")
    private List<WebElement> newOrUsedOptions;
    @FindBy(xpath = "//div[@id='by-make-tab']//*[contains(@class,'sds-field sds-home-search__make')]//option")
    private List<WebElement> makeOptions;
    @FindBy(xpath = "//div[@id='by-make-tab']//*[contains(@class,'sds-field sds-home-search__model')]//option")
    private List<WebElement> modelOptions;
    @FindBy(xpath = "//div[@id='by-make-tab']//*[contains(@class,'sds-field sds-home-search__price')]//option")
    private List<WebElement> priceOptions;
    @FindBy(xpath = "//div[@id='by-make-tab']//*[contains(@class,'sds-field sds-home-search__distance')]//option")
    private List<WebElement> distanceOptions;
    @FindBy(id = "make-model-zip")
    private WebElement zipInput;

    @FindBy(xpath = "//div[@id='by-body-style-tab']//*[contains(@class,'sds-field sds-home-search__')]")
    private List<WebElement> bodyStyleElements;

    @FindBy(id = "by-make")
    private WebElement makeButton;

    @FindBy(id = "by-body-style")
    private WebElement bodyStyleButton;

    public void selectNewOrUsedDropdown(int index){
        makeElements.get(FindYourMatchSelection.NEW_AND_USED.ordinal()).click();
        newOrUsedOptions.get(index).click();
    }
    public void selectMakeDropdown(int index){
        makeElements.get(FindYourMatchSelection.MAKE.ordinal()).click();
        makeOptions.get(index).click();

    }
    public void selectModelDropdown(int index){
        makeElements.get(FindYourMatchSelection.MODEL.ordinal()).click();
        modelOptions.get(index).click();
    }
    public void selectPriceDropdown(int index){
        makeElements.get(FindYourMatchSelection.PRICE.ordinal()).click();
        newOrUsedOptions.get(index).click();
    }

    public void selectDistanceDropdown(int index){
        makeElements.get(FindYourMatchSelection.DISTANCE.ordinal()).click();
        newOrUsedOptions.get(index).click();
    }

    public void sendMakeZip(String text){
        zipInput.sendKeys(text);
    }


    public void selectBodyStyleDropdown(int index, String dropdown){
        Select select = new Select(bodyStyleElements.get(index));

        select.selectByVisibleText(dropdown);
    }

    public void sendBodyStyleZip(String text){
        bodyStyleElements.get(FindYourMatchSelection.ZIP.ordinal()).sendKeys(text);

    }

    public void getMakeButton() {
        makeButton
                .click();
    }

    public void getBodyStyleButton() {
        bodyStyleButton
                .click();
    }

    public void clickSearch(){
        makeElements.get(FindYourMatchSelection.SEARCH.ordinal()).click();
    }
}
