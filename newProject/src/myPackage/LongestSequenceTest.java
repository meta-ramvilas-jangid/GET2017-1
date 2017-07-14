package myPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class LongestSequenceTest {

	@Test
	public void test() {
		LongestSequence ls=new LongestSequence();
		int[] arr1={2,3,4,5,6,3,21,5,3,5};
		int[] test1=ls.longestSequence(arr1);
		int[] exp1={2,3,4,5,6};
		assertArrayEquals(exp1, test1);
	}
	@Test
	public void test1() {
		LongestSequence ls=new LongestSequence();

		int[] arr2={1,2,1,2,1,8,6,7,5,9};
		int[] test2=ls.longestSequence(arr2);
		int[] exp2={1,2};
		assertArrayEquals(exp2, test2);
	}
	@Test
	public void test2() {
		LongestSequence ls=new LongestSequence();

		int[] arr3={2,3,4,5,6,3,21,5,3,5,7,9,11,13,15};
		int[] test3=ls.longestSequence(arr3);
		int[] exp3={3,5,7,9,11,13,15};
		assertArrayEquals(exp3, test3);

	}

}
