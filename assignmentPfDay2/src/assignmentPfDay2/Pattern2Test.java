package assignmentPfDay2;

import static org.junit.Assert.*;

import org.junit.Test;

public class Pattern2Test {

	@Test
	public void testSpaces1() {
		Pattern2 p2=new Pattern2();
		String expected="  ";
		String actual = p2.spaces(3, 7);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testSpaces2() {
		Pattern2 p2=new Pattern2();
		String expected="      ";
		String actual = p2.spaces(7, 9);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testSpaces3() {
		Pattern2 p2=new Pattern2();
		String expected="";
		String actual = p2.spaces(1, 11);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testNumbers1() {
		Pattern2 p2=new Pattern2();
		String expected="1234";
		String actual = p2.numbers(4, 7);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testNumbers2() {
		Pattern2 p2=new Pattern2();
		String expected="12345678";
		String actual = p2.numbers(2, 9);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testNumbers3() {
		Pattern2 p2=new Pattern2();
		String expected="1";
		String actual = p2.numbers(2, 2);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testPyramid1() {
		Pattern2 p2=new Pattern2();
		String expected[]={"1234",
						   " 123",
						   "  12",
						   "   1"};
		String actual[] = p2.printPyramid(4);
		assertArrayEquals(expected, actual);
	}
	
	@Test
	public void testPyramid2() {
		Pattern2 p2=new Pattern2();
		String expected[]={};
		String actual[] = p2.printPyramid(0);
		assertArrayEquals(expected, actual);
	}
	
	@Test
	public void testPyramid3() {
		Pattern2 p2=new Pattern2();
		String expected[]={"123456789",
						   " 12345678",
						   "  1234567",
						   "   123456",
						   "    12345",
						   "     1234",
						   "      123",
						   "       12",
						   "        1"};
		String actual[] = p2.printPyramid(9);
		assertArrayEquals(expected, actual);
	}
	
	

}
