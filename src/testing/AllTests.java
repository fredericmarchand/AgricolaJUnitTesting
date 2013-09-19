package testing;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AgricolaControllerTest.class, AgricolaFrameTest.class,
		FarmPanelTest.class, FarmTest.class, FarmViewTest.class,
		PlayerTest.class, SpaceTest.class })
public class AllTests {

}
