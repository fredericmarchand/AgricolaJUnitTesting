package testing;

import static org.junit.Assert.*;

import javax.swing.JButton;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTextField;

import junit.framework.Assert;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import agricola.FarmView;

public class FarmViewTest {
	
	private static FarmView farmView;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		farmView = new FarmView();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetFarm() {
		Assert.assertNotNull(farmView.getFarm());
	}

	@Test
	public void testGetActions() {
		JButton buttons[] = farmView.getActions();
		assertEquals(buttons.length, 24);
		for (JButton b: buttons)
		{
			assertNotNull(b);
		}
	}

	@Test
	public void testGet3Actions() {
		JButton buttons[] = farmView.get3Actions();
		assertEquals(buttons.length, 4);
		for (JButton b: buttons)
		{
			assertNotNull(b);
		}
	}

	@Test
	public void testGet4Actions() {
		JButton buttons[] = farmView.get4Actions();
		assertEquals(buttons.length, 6);
		for (JButton b: buttons)
		{
			assertNotNull(b);
		}
	}

	@Test
	public void testGet5Actions() {
		JButton buttons[] = farmView.get5Actions();
		assertEquals(buttons.length, 6);
		for (JButton b: buttons)
		{
			assertNotNull(b);
		}
	}

	@Test
	public void testGetButtons() {
		assertNotNull(farmView.getButtons());
		for (int i = 0; i < farmView.getButtons().length; ++i) {
			for (JButton j: farmView.getButtons()[i]) {
				assertNotNull(j);
			}
		}
	}

	@Test
	public void testGetRadio() {
		JRadioButtonMenuItem[] allradio = farmView.getRadio();
		Assert.assertEquals("Player 1", allradio[0].getText());
		Assert.assertEquals("Player 2", allradio[1].getText());
		Assert.assertEquals("Player 3", allradio[2].getText());
		Assert.assertEquals("Player 4", allradio[3].getText());
		Assert.assertEquals("Player 5", allradio[4].getText());
	}

	@Test
	public void testGetPlayer1() {
		assertNotNull(farmView.getPlayer1());
	}

	@Test
	public void testGetPlayer2() {
		assertNotNull(farmView.getPlayer2());
	}

	@Test
	public void testGetPlayer3() {
		assertNotNull(farmView.getPlayer3());
	}

	@Test
	public void testGetPlayer4() {
		assertNotNull(farmView.getPlayer4());
	}

	@Test
	public void testGetPlayer5() {
		assertNotNull(farmView.getPlayer5());
	}

	@Test
	public void testGetPlayerTexts() {
		JTextField[] alltext = farmView.getPlayerTexts();
		Assert.assertEquals("0", alltext[0].getText());
		Assert.assertEquals("0", alltext[1].getText());
		Assert.assertEquals("0", alltext[2].getText());
		Assert.assertEquals("0", alltext[3].getText());
		Assert.assertEquals("0", alltext[4].getText());
		Assert.assertEquals("0", alltext[5].getText());
		Assert.assertEquals("0", alltext[6].getText());
		Assert.assertEquals("2", alltext[7].getText());
		Assert.assertEquals("2", alltext[8].getText());
		Assert.assertEquals("0", alltext[9].getText());
		Assert.assertEquals("0", alltext[10].getText());
		Assert.assertEquals("0", alltext[11].getText());
	}

	@Test
	public void testGetGameTexts() {
		JTextField[] alltext = farmView.getGameTexts();
		Assert.assertEquals("1", alltext[0].getText());
		Assert.assertEquals("3", alltext[1].getText());
		Assert.assertEquals("1", alltext[2].getText());
		Assert.assertEquals("1", alltext[3].getText());
		Assert.assertEquals("1", alltext[4].getText());
		Assert.assertEquals("1", alltext[5].getText());
		Assert.assertEquals("1", alltext[6].getText());
		Assert.assertEquals("1", alltext[7].getText());
		Assert.assertEquals("1", alltext[8].getText());
		Assert.assertEquals("1", alltext[9].getText());
		Assert.assertEquals("1", alltext[10].getText());
		Assert.assertEquals("1", alltext[11].getText());
	}

	@Test
	public void testGet3Texts() {
		JTextField[] alltext = farmView.get3Texts();
		Assert.assertEquals("2", alltext[0].getText());
		Assert.assertEquals("1", alltext[1].getText());
	}

	@Test
	public void testGet4Texts() {
		JTextField[] alltext = farmView.get4Texts();
		Assert.assertEquals("1", alltext[0].getText());
		Assert.assertEquals("2", alltext[1].getText());
		Assert.assertEquals("2", alltext[2].getText());
		Assert.assertEquals("1", alltext[3].getText());
	}

	@Test
	public void testGet5Texts() {
		JTextField[] alltext = farmView.get5Texts();
		Assert.assertEquals("1", alltext[0].getText());
		Assert.assertEquals("1", alltext[1].getText());
		Assert.assertEquals("3", alltext[2].getText());
		Assert.assertEquals("4", alltext[3].getText());
	}

}
