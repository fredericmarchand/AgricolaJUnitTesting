package testing;

import static org.junit.Assert.*;

import javax.swing.JButton;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import agricola.Farm;
import agricola.FarmPanel;
import agricola.Space;

public class FarmPanelTest {
	
	private static FarmPanel farmPanel;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		farmPanel = new FarmPanel(new Farm());
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetButtons() {
		assertNotNull(farmPanel.getButtons());
		for (int i = 0; i < farmPanel.getButtons().length; ++i) {
			for (JButton j: farmPanel.getButtons()[i]) {
				assertNotNull(j);
			}
		}
	}

	@Test
	public void testGetFarm() {
		assertNotNull(farmPanel.getFarm());
		for (int i = 0; i < farmPanel.getFarm().length; ++i) {
			for (Space s: farmPanel.getFarm()[i]) {
					assertNotNull(s);
			}
		}
	}

}
