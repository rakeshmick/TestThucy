package Thucydided.jbehave;

import Thucydided.steps.NswEUSteps;
import net.thucydides.core.annotations.Steps;
import net.thucydides.jbehave.ThucydidesJUnitStories;
import net.thucydides.jbehave.ThucydidesJUnitStory;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

/**
 * Created by rakeshprabhakaran on 25/02/2016.
 */
public class NswTest extends ThucydidesJUnitStory{

    @Steps
    NswEUSteps nswEUSteps;

    @Given("the user is on the NSW home page")
    public void givenTheUserIsOnTheNSWHomePage(){nswEUSteps.is_the_home_page();};

    @When("the user selects the destination tab")
    public void WhenTheUserSelectsTheDestinationTab()
    {nswEUSteps.select_Next_Departure();}

    @When("the user enter the destination as '$townhall'")
    public void  WhenTheUserSelectsTheDestinationAs(String stationName){
        nswEUSteps.enters_Station(stationName);
    }

    @Then("the user should see the destination as '$townhall'")
    public void ThenTheUserShouldSeeTheDestinationInTab(String expected){
        nswEUSteps.assertDestination(expected);
    }




}
