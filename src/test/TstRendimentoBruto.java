package test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import src.RendimentoBruto;

@RunWith(Parameterized.class)
class TstRendimentoBruto {
	
	
	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {
			{ 60, 1000.00, 8.5, 13.97},
			{ 120, 500.00, 8.0, 13.15},
			{ 240, 3000.00, 9.0, 177.53},
			{ 270, 2000.00, 8.5, 125.75},
			{ 390, 100.00, 7.5, 8.01},
			{ 420, 250.00, 8.0, 23.01},
			{ 550, 400.00, 8.0, 48.22},
			{ 670, 800.00, 8.0, 117.48},
			{ 700, 2500.00, 9.0, 431.51},
			{ 900, 4200.00, 9.5, 983.84},
			{ 1000, 100.00, 7.5, 20.55},
		});
	}
	
	@Parameter
	public int n;
	@Parameter(1)
	public double p;
 	@Parameter(2)
	public double i;
 	@Parameter(3)
	public double rb;
	
	@Test
	void testRendimentoBruto() {
		assertEquals(rb, RendimentoBruto.gerarRendimentoBruto(n,p,i), 0.01);
	}

}
