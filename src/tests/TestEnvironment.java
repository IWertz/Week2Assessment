package tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import model.Environment;

public class TestEnvironment {

	Environment lake = new Environment(17000, "Cloudy");

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testIsDay() {
		assertFalse(lake.isDay(lake.getTime()));
	}

}
