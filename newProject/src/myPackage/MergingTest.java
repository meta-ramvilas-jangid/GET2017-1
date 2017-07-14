package myPackage;

import org.junit.Assert;
import org.junit.Test;

public class MergingTest {

	@Test
	public void test() {
		
		Merging m=new Merging();
		int a[]={1,2,4,6,8,9},b[]={2,2,3,5,6},c[]={1,2,2,2,3,4,5,6,6,8,9};
		int arr[]=m.join(a, a.length, b, b.length);
		Assert.assertArrayEquals(c, arr);
	}
	@Test
	public void test1() {
		Merging m=new Merging();
		int a1[]={},b1[]={},c1[]={};
		int arr1[]=m.join(a1, a1.length, b1, b1.length);
		Assert.assertArrayEquals(c1, arr1);
		
	}
	@Test
	public void test2() {
		Merging m=new Merging();
		int a2[]={0,0,0,0,1,1,1},b2[]={},c2[]={0,0,0,0,1,1,1};
		int arr2[]=m.join(a2, a2.length, b2, b2.length);
		Assert.assertArrayEquals(c2, arr2);
		
		
		
		
	}

}
