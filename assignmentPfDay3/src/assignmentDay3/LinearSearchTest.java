package assignmentDay3;

import static org.junit.Assert.*;

import org.junit.Test;

public class LinearSearchTest {

	@Test(expected = IllegalArgumentException.class)
	public void test() {
		LinearSearch ls=new LinearSearch();
		int arr[] = {};
		ls.linearSearch(arr, 54, 0);
	}
	
	@Test
	public void test1() {
		LinearSearch ls = new LinearSearch();
		int arr[] = {2,5,8,9,10, 77, 55};
		int actual = ls.linearSearch(arr, 88, 0);
		int expected = -1;
		assertEquals(expected, actual);
	}

	@Test
	public void test2() {
		LinearSearch ls = new LinearSearch();
		int arr[] = {2,5,8,9,10, 77, 55, 11};
		int actual = ls.linearSearch(arr, 77, 0);
		int expected = 5;
		assertEquals(expected, actual);
	}
}
