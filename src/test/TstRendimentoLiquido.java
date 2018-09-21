package test;

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

class TstRendimentoLiquido {
	
	@Parameters
	public static Collection<Object[]> data(){
		return Arrays.asList(new Object[][] {
			{ 60, 1000.0, 8.5, 1.0829},
			{ 120, 500.0, 8.0, 2.0384},
			{ 240, 3000.0, 9.0, 4.7342},
			{ 270, 2000.0, 8.5, 5.0301},
			{ 390, 100.0, 7.5, 6.6113},
			{ 420, 250.0, 8.0, 7.5945},
			{ 550, 400.0, 8.0, 9.9452},
			{ 670, 800.0, 8.0, 12.1151},
			{ 700, 2500.0, 9.0, 14.2397},
			{ 900, 4200.0, 9.5, 19.9110},
			{ 1000, 100.0, 7.5, 17.4658},
		});
	}
	
	@Parameter
	public int n;
	
	@Parameter(1)
	public double p;
 	@Parameter(2)
	public double i;
 	@Parameter(3)
	public double rl;
	
	@Test
	void testRendimentoLiquido() {
		assertEquals(rl, RendimentoBruto.gerarRendimentoLiquido(n,p,i), 0.00005);
	}

}
