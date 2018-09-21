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
class TstImposto {
	
	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {
			{ 60, 1000.0, 8.5, 3.14},
			{ 120, 500.0, 8.0, 2.96},
			{ 240, 3000.0, 9.0, 35.51},
			{ 270, 2000.0, 8.5, 25.15},
			{ 390, 100.0, 7.5, 1.40},
			{ 420, 250.0, 8.0, 4.03},
			{ 550, 400.0, 8.0, 8.44},
			{ 670, 800.0, 8.0, 20.56},
			{ 700, 2500.0, 9.0, 75.51},
			{ 900, 4200.0, 9.5, 147.58},
			{ 1000, 100.0, 7.5, 3.08},
		});
	}
	
	@Parameter
	public int n;
	@Parameter(1)
	public double p;
 	@Parameter(2)
	public double i;
 	@Parameter(3)
	public double im;

	@Test
	void testImposto() {
		assertEquals(im, RendimentoBruto.gerarImposto(n,p,i), 0.01);
	}

}
