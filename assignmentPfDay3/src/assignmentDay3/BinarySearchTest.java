package assignmentDay3;

import static org.junit.Assert.*;

import org.junit.Test;

public class BinarySearchTest {

	@Test(expected = IllegalArgumentException.class)
	public void test() {
		BinarySearch bs = new BinarySearch();
		int arr[] = {};
		bs.binSearch(arr, 0, arr.length-1, 9);
	}
	
	@Test
	public void test1() {
		BinarySearch bs = new BinarySearch();
		int arr[] = {2,5,8,9,10, 77, 55};
		int actual = bs.binSearch(arr, 0, arr.length-1, 88);
		int expected = -1;
		assertEquals(expected, actual);
	}

	@Test
	public void test2() {
		BinarySearch bs = new BinarySearch();
		int arr[] = {2,5,8,9,10, 77, 55, 11};
		int actual = bs.binSearch(arr, 0, arr.length-1, 77);
		int expected = 5;
		assertEquals(expected, actual);
	}

}
