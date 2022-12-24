package bbcalculator.solar;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCalculator {

	@Test
	public void testadd() {
		assertEquals(20, Calculation.add(15,5));
	}
	@Test
	public void testsub() {
		assertEquals(10, Calculation.substract(15,5));
	}
	@Test
	public void testmul() {
		assertEquals(75, Calculation.multiply(15,5));
	}
	@Test
	public void testdiv() {
		assertEquals(3, Calculation.divide(15,5));
	}
}




