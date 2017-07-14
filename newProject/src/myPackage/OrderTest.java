package myPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class OrderTest {

	@Test
	public void test() {
		Order order=new Order();
		int arr[]={9,7,5,3,1,1,1,1,0,0,0,0},exp=2;
		int status=order.checkOrder(arr);
		assertEquals(exp, status);
		}
	@Test
	public void test1() {
		Order order=new Order();
		
		int arr1[]={},exp1=0;
		int status1=order.checkOrder(arr1);
		assertEquals(exp1, status1);
	}
	@Test
	public void test2() {
		Order order=new Order();
		
		int arr2[]={1,4,6,4,3,7,0,0},exp2=0;
		int status2=order.checkOrder(arr2);
		assertEquals(exp2, status2);
	}
	@Test
	public void test3() {
		Order order=new Order();
		
		int arr3[]={1,1,1,1},exp3=0;
		int status3=order.checkOrder(arr3);
		assertEquals(exp3, status3);
	}
	@Test
	public void test4() {
		Order order=new Order();
		
		int arr4[]={-1,-1,1,1,2,4,6,8,10},exp4=1;
		int status4=order.checkOrder(arr4);
		assertEquals(exp4, status4);
		
		
	}

}
