package assignmentPfDay2;

import static org.junit.Assert.*;

import org.junit.Test;

public class Pattern1Test {

	@Test
	public void testSpaces1() {
		Pattern1 p1=new Pattern1();
		int n=8,row=1;
		String expected="       ";
		String actual=p1.spaces(row, n);
		assertEquals(expected, actual);
		
	}
	
	@Test
	public void testSpaces2() {
		Pattern1 p1=new Pattern1();
		int n=3,row=5;
		String expected="  ";
		String actual=p1.spaces(row, n);
		assertEquals(expected, actual);
		
	}
	
	@Test
	public void testSpaces3() {
		Pattern1 p1=new Pattern1();
		int n=7,row=7;
		String expected="";
		String actual=p1.spaces(row, n);
		assertEquals(expected, actual);
		
	}
	
	@Test
	public void testNumbers1() {
		Pattern1 p1=new Pattern1();
		int n=3,row=5;
		String expected="1";
		String actual=p1.numbers(row, n);
		assertEquals(expected, actual);
		
	}
	
	@Test
	public void testNumbers2() {
		Pattern1 p1=new Pattern1();
		int n=6,row=5;
		String expected="123454321";
		String actual=p1.numbers(row, n);
		assertEquals(expected, actual);
		
	}
	
	@Test
	public void testNumbers3() {
		Pattern1 p1=new Pattern1();
		int n=8,row=12;
		String expected="1234321";
		String actual=p1.numbers(row, n);
		assertEquals(expected, actual);
		
	}
	
	@Test
	public void testPattern() {
		Pattern1 p1=new Pattern1();
		int n=3;
		String expected[]={"  1",
						   " 121",
						   "12321",
						   " 121",
						   "  1"};
		String actual[]=p1.printPyramid(n);
		assertArrayEquals(expected, actual);
		
	}
	
	@Test
	public void testPattern2() {
		Pattern1 p1=new Pattern1();
		int n=6;
		String expected[]={"     1",
						   "    121",
						   "   12321",
						   "  1234321",
						   " 123454321",
						   "12345654321",
						   " 123454321",
						   "  1234321",
						   "   12321",
						   "    121",
						   "     1"};
		String actual[]=p1.printPyramid(n);
		assertArrayEquals(expected, actual);
		
	}
	
	@Test
	public void testPattern3() {
		Pattern1 p1=new Pattern1();
		int n=1;
		String expected[]={"1"};
		String actual[]=p1.printPyramid(n);
		assertArrayEquals(expected, actual);
		
	}

}
