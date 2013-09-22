package testing;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import agricola.Player;

public class PlayerTest {
	
	private static Player player;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		player = new Player();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testPlayer() {
		assertEquals(0, player.getFood());
		assertEquals(0, player.getReed());
		assertEquals(0, player.getWood());
		assertEquals(0, player.getClay());
		assertEquals(0, player.getStone());
		assertEquals(0, player.getGrain());
		assertEquals(0, player.getVege());
		assertEquals(2, player.getFamily());
		assertEquals(2, player.getActiveFamily());
		assertEquals(2, player.getRooms());
		assertEquals('w', player.getRoomType());
		assertEquals(0, player.getSheep());
		assertEquals(0, player.getCattle());
		assertEquals(0, player.getBoar());
		assertEquals(0, player.getField());
		assertEquals(13, player.getEmpty());
		assertEquals(0, player.getPasture());
		assertEquals(0, player.getStable());
		assertEquals(0, player.getScore());
		assertEquals(false, player.hasOven());
	}

	@Test
	public void testGetScore() {
		assertEquals(0, player.getScore());
	}

	@Test
	public void testCalcScore() {
		int expectedScore = 11;
		/* Setting values for resources that will generate a score */
		player.addGrain();
		player.addVege();
		player.addRooms(3);
		player.addSheep(4);
		player.addCattle(2);
		player.addBoar(1);
		player.addField();
		player.addField();
		player.addPasture(2);
		player.addStable(2);
		
		/* Calculate the player's score */
		player.calcScore();
		System.out.println(player.getScore());
		/* Check that the score is what it is expected to be */
		assertEquals(expectedScore, player.getScore());
	}

	@Test
	public void testAddScore() {
		player.addScore(2);
		assertEquals(2, player.getScore());
	}

	@Test
	public void testHasOven() {
		assertEquals(false, player.hasOven());
	}

	@Test
	public void testSetOven() {
		player.setOven();
		assertEquals(true, player.hasOven());
	}

	@Test
	public void testAddField() {
		player.addField();
		assertEquals(1, player.getField());
	}

	@Test
	public void testDecVege() {
		player.decVege();
		assertEquals(-1, player.getVege());
	}

	@Test
	public void testDecGrain() {
		player.decGrain();
		assertEquals(-1, player.getGrain());
	}

	@Test
	public void testGetField() {
		assertEquals(0, player.getField());
	}

	@Test
	public void testDecEmpty() {
		player.decEmpty(5);
		assertEquals(8, player.getEmpty());
	}

	@Test
	public void testGetPasture() {
		assertEquals(0, player.getPasture());
	}

	@Test
	public void testAddPasture() {
		player.addPasture(3);
		assertEquals(3, player.getPasture());
	}

	@Test
	public void testGetStable() {
		assertEquals(0, player.getStable());
	}

	@Test
	public void testAddStable() {
		player.addStable(6);
		assertEquals(6, player.getStable());
	}

	@Test
	public void testGetEmpty() {
		assertEquals(13, player.getEmpty());
	}

	@Test
	public void testAddSheep() {
		player.addSheep(7);
		assertEquals(7, player.getSheep());
	}

	@Test
	public void testGetSheep() {
		assertEquals(0, player.getSheep());
	}

	@Test
	public void testAddBoar() {
		player.addBoar(3);
		assertEquals(3, player.getBoar());
	}

	@Test
	public void testGetBoar() {
		assertEquals(0, player.getBoar());
	}

	@Test
	public void testAddCattle() {
		player.addCattle(2);
		assertEquals(2, player.getCattle());
	}

	@Test
	public void testGetCattle() {
		assertEquals(0, player.getCattle());
	}

	@Test
	public void testHasChild() {
		assertEquals(false, player.hasChild());
	}

	@Test
	public void testSetChild() {
		boolean value = player.hasChild();
		player.setChild();
		assertEquals(!value, player.hasChild());
	}

	@Test
	public void testGetRoomType() {
		assertEquals('w', player.getRoomType());
	}

	@Test
	public void testSetRoomType() {
		char value = 'c';
		player.setRoomType(value);
		assertEquals(value, player.getRoomType());
	}

	@Test
	public void testGetFood() {
		assertEquals(0, player.getFood());
	}

	@Test
	public void testGetReed() {
		assertEquals(0, player.getReed());
	}

	@Test
	public void testGetWood() {
		assertEquals(0, player.getWood());
	}

	@Test
	public void testGetClay() {
		assertEquals(0, player.getClay());
	}

	@Test
	public void testGetStone() {
		assertEquals(0, player.getStone());
	}

	@Test
	public void testGetGrain() {
		assertEquals(0, player.getGrain());
	}

	@Test
	public void testGetVege() {
		assertEquals(0, player.getVege());
	}

	@Test
	public void testGetFamily() {
		assertEquals(2, player.getFamily());
	}

	@Test
	public void testGetRooms() {
		assertEquals(2, player.getRooms());
	}

	@Test
	public void testGetActiveFamily() {
		assertEquals(2, player.getActiveFamily());
	}

	@Test
	public void testUseFam() {
		player.useFam();
		assertEquals(1, player.getActiveFamily());
	}

	@Test
	public void testResetFam() {
		player.useFam();
		player.resetFam();
		assertEquals(2, player.getActiveFamily());
	}

	@Test
	public void testAddFood() {
		player.addFood(8);
		assertEquals(8, player.getFood());
	}

	@Test
	public void testAddReed() {
		player.addReed(3);
		assertEquals(3, player.getReed());
	}

	@Test
	public void testAddWood() {
		player.addWood(2);
		assertEquals(2, player.getWood());
	}

	@Test
	public void testAddClay() {
		player.addClay(2);
		assertEquals(2, player.getClay());
	}

	@Test
	public void testAddStone() {
		player.addStone(5);
		assertEquals(5, player.getStone());
	}

	@Test
	public void testAddGrain() {
		player.addGrain();
		assertEquals(1, player.getGrain());
	}

	@Test
	public void testAddVege() {
		player.addVege();
		assertEquals(1, player.getVege());
	}

	@Test
	public void testAddFamily() {
		player.addFamily();
		assertEquals(true, player.hasChild());
		assertEquals(3, player.getFamily());
	}

	@Test
	public void testAddRooms() {
		player.addRooms(1);
		assertEquals(3, player.getRooms());
	}

}
