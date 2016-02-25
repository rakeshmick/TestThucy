package Thucydided.steps;

import Thucydided.pages.Nswtransport;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

/**
 * Created by rakeshprabhakaran on 25/02/2016.
 */
public class NswEUSteps extends ScenarioSteps{

    Nswtransport nswtransport;

    @Step
    public void is_the_home_page(){ nswtransport.open();}

    @Step
    public void select_Next_Departure(){nswtransport.clickDeparture();}

    @Step

    public void enters_Station(String destination){
        nswtransport.enterDestination(destination);
        nswtransport.selectFirst();
    }

    @Step
    public void assertDestination(String expectedDestination){
        assertThat(nswtransport.getText(),containsString(expectedDestination));
    }

}
