package Thucydided.jbehave;

import net.thucydides.jbehave.ThucydidesJUnitStories;
import net.thucydides.jbehave.ThucydidesJUnitStory;

/**
 * Created by rakeshprabhakaran on 25/02/2016.
 */
public class TesOne  extends ThucydidesJUnitStory {
    public void MyFeatureTests() {
       // findStoriesCalled("**/myfeature/*.story");
        findStoriesCalled("NswTest.story");
       // /Users/rakeshprabhakaran/Documents/workspace/TestThucy/src/test/resources/Thucydided/stories/consult_dictionary/NswTest.story
    }
}
