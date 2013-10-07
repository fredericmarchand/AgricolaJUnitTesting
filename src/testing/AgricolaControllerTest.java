package testing;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import agricola.AgricolaController;

public class AgricolaControllerTest {
	
	private static AgricolaController agricolaController;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		agricolaController = new AgricolaController(5);
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testInitialFoodSetup() {
		if (agricolaController.num_players == 1)
			assertEquals(0, agricolaController.players[0].getFood());
		else {
			for (int i = 0; i < agricolaController.num_players; ++i) {
				if (i == 0)
					assertEquals(2, agricolaController.players[i].getFood());
				else
					assertEquals(3, agricolaController.players[i].getFood());
			}
		}
	}
	
	@Test
	public void testInitialHousingSetup() {
		for (int i = 0; i < agricolaController.num_players; ++i) {
			assertEquals(2, agricolaController.players[i].getRooms());
		}
	}
	
	@Test
	public void testInitialFamilySetup() {
		for (int i = 0; i < agricolaController.num_players; ++i) {
			assertEquals(2, agricolaController.players[i].getFamily());
		}
	}
	
	@Test
	public void testBuildStables() {
		agricolaController = new AgricolaController(1);
		agricolaController.players[0].addWood(2);
		agricolaController.wStable = true;

		/* This will prompt the user to choose between stable or room */
		/* No matter what is chosen, a stable will be built and the wood will go below 0 and that should not happen */
		agricolaController.view.panel_farm.b[1][5].doClick();
		agricolaController.update(false);
		agricolaController.view.panel_farm.b[1][3].doClick();
		agricolaController.update(false);
		agricolaController.view.panel_farm.b[1][1].doClick();
		agricolaController.update(false);
		assertEquals(0, agricolaController.players[0].getWood());
	}
	
	@Test
	public void testPlowField() {
		agricolaController = new AgricolaController(1);
		agricolaController.wField = true;
		agricolaController.view.panel_farm.b[1][5].doClick();
		agricolaController.b_wood.doClick();
		agricolaController.wField = true;
		agricolaController.view.panel_farm.b[5][3].doClick();
		agricolaController.b_wood.doClick();
		/* Fields are supposed to be built orthogonally adjacent to one another after there has been a field built, 
		 * clearly not the case here according to the coordinates [5][3] and [1][5] */
		/* If two non orthogonally adjacent fields are built then assert a failure */
		if (agricolaController.view.panel_farm.getFarm()[5][3].getType() == agricolaController.view.panel_farm.getFarm()[1][5].getType()) {
			if (agricolaController.view.panel_farm.getButtons()[5][3].getBackground() == agricolaController.view.panel_farm.getButtons()[1][5].getBackground() &&
					agricolaController.view.panel_farm.getButtons()[5][3].getBackground() != agricolaController.view.panel_farm.getButtons()[1][1].getBackground());
				assertFalse(true);
		}
	}

	@Test
	public void test3WoodAction1Player() {
		agricolaController = new AgricolaController(1);
		agricolaController.b_wood.doClick();
		agricolaController.update(false);
		assertEquals(2, agricolaController.players[0].getWood());
	}
	
	@Test
	public void testFeedFamilySinglePlayer() {
		agricolaController = new AgricolaController(1);
		agricolaController.players[0].food = 10;
		for (int i = 0; i < 4; ++i) {
			agricolaController.b_wood.doClick();
			agricolaController.b_reed.doClick();
		}
		assertEquals(4, agricolaController.players[0].getFood());
	}
	
}
