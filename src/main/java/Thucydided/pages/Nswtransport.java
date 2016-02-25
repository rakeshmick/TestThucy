package Thucydided.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.csv.converters.StringTypeConverter;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import net.thucydides.core.pages.WebElementFacade;

/**
 * Created by rakeshprabhakaran on 25/02/2016.
 */

@DefaultUrl("http://www.transportnsw.info/")
public class Nswtransport extends PageObject{

    @FindBy(id = "main")
    WebElementFacade tripPlanner;

    @FindBy(css = "ul.js-tabs li.tab-control.tab-control-next-departures")
    WebElementFacade nextDeparture;

    @FindBy(css = "input#next-departures-from.js-autocomplete-train-stations.tt-query")
    WebElementFacade from;

    @FindBy(css = ".tt-dropdown-menu .tt-dataset-0 .tt-suggestions .tt-suggestion .icon")
    WebElementFacade firstSuggestion;

    public void  clickDeparture(){
        nextDeparture.click();
    }

    public void enterDestination(String text){
        from.type(text);

    }

    public void selectFirst(){

        firstSuggestion.waitUntilVisible().click();
    }
    public void enterKey(){
        from.sendKeys(Keys.ENTER);
    }


    public String getText(){
        return from.getValue();
    }

}
