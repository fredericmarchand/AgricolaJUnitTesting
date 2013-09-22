package testing;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import agricola.Space;

public class SpaceTest {
	
	private static Space testSpace;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		testSpace = new Space();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSpace() {
		Assert.assertEquals("Initial character is not equal to the default value for space", 'e', testSpace.getType());
		Assert.assertEquals(0, testSpace.getStack());
		Assert.assertEquals(false, testSpace.isSquare());
		Assert.assertEquals(true, testSpace.isValid());
	}

	@Test
	public void testSetType() {
		char value = 'w';
		testSpace.setType(value);
		Assert.assertEquals(value, testSpace.getType());
	}

	@Test
	public void testSetStack() {
		int value = 5;
		testSpace.setStack(value);
		Assert.assertEquals(value, testSpace.getStack());
	}

	@Test
	public void testDecStack() {
		int previousValue = testSpace.getStack();
		testSpace.decStack();
		assertEquals(previousValue-1, testSpace.getStack());
	}

	@Test
	public void testGetStack() {
		int value = 4;
		testSpace.setStack(value);
		assertEquals(value, testSpace.getStack());
	}

	@Test
	public void testSetSquare() {
		/* Check is the valid parameter has the default value of being false */
		Assert.assertEquals(false, testSpace.isSquare());
		/* This method sets valid to true */
		testSpace.setSquare();
		/* Check is the valid parameter has the value true */
		Assert.assertEquals(true, testSpace.isSquare());
	}

	@Test
	public void testSetValid() {
		testSpace.setValid();
		assertEquals(false, testSpace.isValid());
	}

	@Test
	public void testIsSquare() {
		assertEquals(false, testSpace.isSquare());
		testSpace.setSquare();
		assertEquals(true, testSpace.isSquare());
	}

	@Test
	public void testIsValid() {
		/* Check is the valid parameter has the default value of being true */
		Assert.assertEquals(true, testSpace.isValid());
		/* This method sets valid to false */
		testSpace.setValid();
		/* Check is the valid parameter has the value false */
		Assert.assertEquals(false, testSpace.isValid());
	}

	@Test
	public void testGetType() {
		char value = 'w';
		assertEquals('e', testSpace.getType());
		testSpace.setType(value);
		assertEquals(value, testSpace.getType());
	}

}
