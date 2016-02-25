package Thucydided.jbehave;

import net.thucydides.jbehave.ThucydidesJUnitStories;

public class AcceptanceTestSuite extends ThucydidesJUnitStories {

    public void test(){
        findStoriesCalled("LookupADefinition.story");
    }
}
