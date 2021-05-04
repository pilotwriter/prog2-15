package TestGgT;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import aufgabe15.GgT;
import aufgabe15.GgtIterativ;

public class TestGgTIterativ {
	
	//iterative testcases
	@Test
	void TestGgtIterativDivisorExist() {
		GgT testObj = new GgtIterativ();
		long result = testObj.berechneGgt(54, 24);
		//Test the output
		assertEquals(6, result);
	}
	//try with one
	@Test
	void TestGgtIterativDivisorWithOne() {
		GgT testObj = new GgtIterativ();
		long result = testObj.berechneGgt(1, 54);
		//Test the output
		assertEquals(1, result);
	}
	@Test
	void TestGgtIterativWithItself() {
		GgT testObj = new GgtIterativ();
		long result = testObj.berechneGgt(54, 54);
		//Test the output
		assertEquals(54, result);
	}
	
	@Test
	void TestGgtIterativNoCommonDivisors() {
		GgT testObj = new GgtIterativ();
		long result = testObj.berechneGgt(5, 7);
		//Test the output
		assertEquals(1, result);
	}
	
}
