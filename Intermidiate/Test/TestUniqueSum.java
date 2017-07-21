package Test;

import static org.junit.Assert.*;
import TestClasses.UniqueSum;

import org.junit.Test;

public class TestUniqueSum {

	@Test
	public void test() {
		UniqueSum testing = new UniqueSum();
		assertEquals(0,testing.imp(1, 1, 1));
		
	}

}
