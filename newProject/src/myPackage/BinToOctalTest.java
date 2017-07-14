package myPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class BinToOctalTest {

	@Test
	public void test() {
		BinToOctal bto=new BinToOctal();
		int octal=bto.convertBinaryToOctal(101010);
		int exp=52;
		assertEquals(exp, octal);
	}
	@Test
	public void test1() {
		BinToOctal bto=new BinToOctal();
		
		int octal1=bto.convertBinaryToOctal(1001);
		int exp1=11;
		assertEquals(exp1, octal1);
		
		
	}
	@Test
	public void test2() {
		BinToOctal bto=new BinToOctal();
		
		int octal1=bto.convertBinaryToOctal(110101);
		int exp1=65;
		assertEquals(exp1, octal1);
		
		
	}


}
