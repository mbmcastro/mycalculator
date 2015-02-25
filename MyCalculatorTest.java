package mycalculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyCalculatorTest {

	@Test
	public void testNfactorial() {
		MyCalculator mc = new MyCalculator();
		int actual = mc.nfactorial(1);
		assertEquals("3!",1,actual,0.0);
	}

	@Test
	public void testNfactorial__5() {
		MyCalculator mc = new MyCalculator();
		int actual = mc.nfactorial(5);
		assertEquals("5!",120,actual,0.0);
	}
	@Test
	public void testNfactorial__10() {
		MyCalculator mc = new MyCalculator();
		int actual = mc.nfactorial(10);
		assertEquals("10!",3628800,actual,0.0);
	}
	@Test
	public void testNfactorial__12() {
		MyCalculator mc = new MyCalculator();
		int actual = mc.nfactorial(12);
		assertEquals("12!",479001600,actual,0.0);
	}

	@Test
	public void testBinarySearch_6() {				//number is at the end of the array
		MyCalculator mc = new MyCalculator();
		int[] x = {1,2,3,4,5,6};
		int actual = mc.binarySearch(x, 6);
		assertEquals("5",5,actual,0.0);
	}
	@Test
	public void testBinarySearch_1() {				//number is at the beginning of the array
		MyCalculator mc = new MyCalculator();
		int[] x = {1,2,3,4,5,6};
		int actual = mc.binarySearch(x, 1);
		assertEquals("0",0,actual,0.0);
	}
	@Test
	public void testBinarySearch_0() {				//array has only 1 element
		MyCalculator mc = new MyCalculator();
		int[] x = {0};
		int actual = mc.binarySearch(x, 0);
		assertEquals("0",0,actual,0.0);
	}
	@Test
	public void testBinarySearch_4() {				//number is greater than the middle
		MyCalculator mc = new MyCalculator();
		int[] x = {1,2,3,4,5};
		int actual = mc.binarySearch(x, 4);
		assertEquals("3",3,actual,0.0);
	}
	@Test
	public void testBinarySearch_3() {				//number is at the middle
		MyCalculator mc = new MyCalculator();
		int[] x = {1,2,3,4,5};
		int actual = mc.binarySearch(x, 3);
		assertEquals("2",2,actual,0.0);
	}
	@Test
	public void testBinarySearch_5() {				//number is not in the array
		MyCalculator mc = new MyCalculator();
		int[] x = {1,2,3,4,6};
		int actual = mc.binarySearch(x, 5);
		assertEquals("1",1,actual,0.0);
	}
	@Test
	public void testBinarySearch_2() {				//number is less than the middle
		MyCalculator mc = new MyCalculator();
		int[] x = {1,2,3,4,5};
		int actual = mc.binarySearch(x, 2);
		assertEquals("1",1,actual,0.0);
	}
}
