package com.java.homework;

import static org.junit.Assert.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class GetMaxTest {

	@Test
	public void testGetMax0() {		
		List<Integer> actual = GetMax.getMax(3);
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(8);
		expected.add(6);
		expected.add(6);
		assertEquals(expected, actual);
	
	}
	
	@Test
	public void testGetMax1() {	
		List<Integer> actual = GetMax.getMax(5);
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(8);
		expected.add(6);
		expected.add(6);
		expected.add(4);
		expected.add(3);
		assertEquals(expected, actual);
	
	}
	
	@Test
	public void testGetMax2() {	
		List<Integer> actual = GetMax.getMax(0);
		List<Integer> expected = null;
		assertEquals(expected, actual);
	
	}

	@Test
	public void testGetMax3() {	
		List<Integer> actual = GetMax.getMax(10);
		List<Integer> expected = null;
		assertEquals(expected, actual);
	
	}
}
