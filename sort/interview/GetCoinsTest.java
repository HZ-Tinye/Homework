package main.java.com.homework;

import static org.junit.Assert.*;

import org.junit.Test;

public class GetCoinsTest {

	@Test
	public void testGetCoins() {
	GetCoins.getCoins(0);
	}
	@Test
	public void testGetCoins1() {
	GetCoins.getCoins(-1);
	}
	@Test
	public void testGetCoins2() {
	GetCoins.getCoins('A');
	}
	@Test
	public void testGetCoins3() {
	GetCoins.getCoins(100);
	}
}
