package myPackage;

import org.junit.Assert;
import org.junit.Test;

public class RemoveDuplicatesTest {

	@Test
	public void test() {
		RemoveDuplicates rd=new RemoveDuplicates();
		int arr[]={2,5,4,6,3,8,5,9,3,3,6,3,9,0},exp[]={2,5,4,6,3,8,9,0};
		int result[]=rd.remDups(arr);
		Assert.assertArrayEquals(exp, result);
	}
	@Test
	public void test1() {
		RemoveDuplicates rd=new RemoveDuplicates();
		
		int arr1[]={1,1,1,1,1,1},exp1[]={1};
		int result1[]=rd.remDups(arr1);
		Assert.assertArrayEquals(exp1, result1);
	}
	@Test
	public void test2() {
		RemoveDuplicates rd=new RemoveDuplicates();
		
		int arr2[]={-1,-4,6,6,8,-4,8,-89,0,-89,-1,-1,-4},exp2[]={-1,-4,6,8,-89,0};
		int result2[]=rd.remDups(arr2);
		Assert.assertArrayEquals(exp2, result2);
	}

}
