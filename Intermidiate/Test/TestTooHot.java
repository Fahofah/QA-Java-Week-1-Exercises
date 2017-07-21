package Test;

import static org.junit.Assert.*;
import TestClasses.TooHot;

import org.junit.Test;

public class TestTooHot {

	@Test
	public void testNull() {
		TooHot testing = new TooHot();
		assertNotNull(testing.check(34, false));
	}

	@Test
	public void testTrue() {
		TooHot testing = new TooHot();
		assertFalse(testing.check(30,true));
	}
}
