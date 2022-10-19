package tests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

import codes.Problem1;

public class TestProblem1 {

	@Test
	public void test1() {
		
		Problem1 p1=new Problem1();
		int n=6;
		ArrayList<Integer> arr=new ArrayList<Integer>(Arrays.asList(16, 17, 4, 3, 5, 2));
		ArrayList<Integer> k=new ArrayList<Integer>(p1.ans(n, arr));		
		Integer[] ar = new Integer[k.size()]; 
        ar = k.toArray(ar); 
        Integer[] z=new Integer[] {2, 5, 17};
        assertArrayEquals(ar, z);
        
	}
	
	@Test
	public void test2() {
		
		Problem1 p2=new Problem1();
		int n2=5;
		ArrayList<Integer> arr2=new ArrayList<Integer>(Arrays.asList(1,2,3,4,0));
		ArrayList<Integer> k2=new ArrayList<Integer>(p2.ans(n2, arr2));		
		Integer[] ar2 = new Integer[k2.size()]; 
        ar2 = k2.toArray(ar2); 
        Integer[] z2=new Integer[] {0,4};
        assertArrayEquals(ar2, z2);
        
	}
	
	//TEST FOR INPUT-2
    
}
