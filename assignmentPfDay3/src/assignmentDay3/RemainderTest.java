package assignmentDay3;

import static org.junit.Assert.*;

import org.junit.Test;

public class RemainderTest {

	@Test(expected = IllegalArgumentException.class)
	public void test() {
		Remainder remainder = new Remainder();
		@SuppressWarnings("unused")
		int expected=remainder.rem(2, 0);
	}
	
	@Test
	public void test1() {
		Remainder remainder = new Remainder();
		int actual = remainder.rem(2, 1);
		int expected = 0;
		assertEquals(expected, actual);
	}

	@Test
	public void test2() {
		Remainder remainder=new Remainder();
		int actual=remainder.rem(100, 3);
		int expected = 1;
		assertEquals(expected, actual);
	}

}
