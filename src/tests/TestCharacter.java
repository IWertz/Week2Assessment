package tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import model.Character;

public class TestCharacter {

	Character me = new Character("Isaiah", 19, 100);
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testTakeDamage() {
		assertEquals("Remaining Health: 6", (me.takeDamage(94)));
	}
	
	@Test
	public void testIsAlive() {
		assertTrue(me.isAlive());
	}

}
