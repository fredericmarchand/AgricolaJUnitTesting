package testing;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import agricola.AgricolaFrame;

public class AgricolaFrameTest {

	private static AgricolaFrame agricolaFrame;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		agricolaFrame = new AgricolaFrame();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void doNothing() {
		assertEquals(0, agricolaFrame.getComponentCount());
	}

}
