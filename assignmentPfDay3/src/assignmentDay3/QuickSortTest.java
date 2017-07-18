package assignmentDay3;

import static org.junit.Assert.*;

import org.junit.Test;

public class QuickSortTest {

	@Test(expected = IllegalArgumentException.class)
	public void test() {
		QuickSort bs = new QuickSort();
		int[] arr = {};
		bs.quickSort(arr, 0, arr.length-1);
	}
	
	@Test
	public void test1() {
		QuickSort bs = new QuickSort();
		int[] arr = {12, 45, 78, -12, 45, 43};
		int[] actual = bs.quickSort(arr, 0, arr.length-1);
		int[] expected = {-12, 12, 43, 45, 45, 78};
		assertArrayEquals(expected, actual);
	}

	@Test
	public void test2() {
		QuickSort bs = new QuickSort();
		int[] arr = {1};
		int[] actual = bs.quickSort(arr, 0, arr.length-1);
		int[] expected = {1};
		assertArrayEquals(expected, actual);
	}

}
