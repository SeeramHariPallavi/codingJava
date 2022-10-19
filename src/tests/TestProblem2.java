package tests;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import codes.Problem2;

public class TestProblem2 {

	@Test
	public void test1() {
		Problem2 p=new Problem2();
		int n1=7;
		int k1=50;
		int[] a1=new int[] {1, 12, 5, 111, 200, 1000, 10};
		assertEquals(p.countOfItems(a1, n1, k1), 4);
	}
	
	@Test
	public void test2() {
		Problem2 p2=new Problem2();
		int n2=3;
		int k2=100;
		int[] a2=new int[] {10,40,50};
		assertEquals(p2.countOfItems(a2, n2, k2), 3);
	}

}
