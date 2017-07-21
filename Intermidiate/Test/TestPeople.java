package Test;

import static org.junit.Assert.*;
import TestClasses.People;
import org.junit.Test;

public class TestPeople {

	@Test
	public void testPeople() {
		People p = new People();
		assertNull(p.getName());
	}
	
	@Test
	public void testGetName(){
		People p = new People("ya",5,"lo");
		assertNotNull(p.getName());
		
	}
	
	@Test
	public void testAge(){
		People p = new People("ya",5,"lo");
		p.setAge(7);
		assertEquals(7,p.getAge());
	}
	
	

}
