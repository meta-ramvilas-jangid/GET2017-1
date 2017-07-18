package assignmentDay3;

import static org.junit.Assert.*;

import org.junit.Test;

public class LargestDigitTest {

	@Test(expected = IllegalArgumentException.class)
	public void test() {
		LargestDigit digit = new LargestDigit();
		@SuppressWarnings("unused")
		int actual = digit.largestDigit(-123);
	}
	
	@Test
	public void test1() {
		LargestDigit digit = new LargestDigit();
		int actual = digit.largestDigit(2);
		int expected = 2;
		assertEquals(expected, actual);
	}
	
	@Test
	public void test2() {
		LargestDigit digit = new LargestDigit();
		int actual = digit.largestDigit(1257369);
		int expected = 9;
		assertEquals(expected, actual);
	}
	
	@Test
	public void test4() {
		LargestDigit digit = new LargestDigit();
		int actual = digit.largestDigit(444);
		int expected = 4;
		assertEquals(expected, actual);
	}
	
	

}
