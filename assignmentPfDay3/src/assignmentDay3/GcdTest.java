package assignmentDay3;

import static org.junit.Assert.*;

import org.junit.Test;

public class GcdTest {

	@Test(expected = IllegalArgumentException.class)
	public void test() {
		Gcd gcd=new Gcd() ;
		@SuppressWarnings("unused")
		int expected = gcd.gcd(2, 0);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void test1() {
		Gcd gcd=new Gcd() ;
		@SuppressWarnings("unused")
		int expected = gcd.gcd(0, 0);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void test2() {
		Gcd gcd=new Gcd() ;
		@SuppressWarnings("unused")
		int expected = gcd.gcd(-1, -1);
	}
	
	@Test
	public void test3() {
		Gcd gcd=new Gcd() ;
		int actual = gcd.gcd(12, 18);
		int expected=6;
		assertEquals(expected, actual);
	}

	@Test
	public void test4() {
		Gcd gcd=new Gcd() ;
		int actual = gcd.gcd(2, 1);
		int expected=1;
		assertEquals(expected, actual);
	}

	
	@Test
	public void test5() {
		Gcd gcd=new Gcd() ;
		int actual = gcd.gcd(100, 3);
		int expected=1;
		assertEquals(expected, actual);
	}
}
