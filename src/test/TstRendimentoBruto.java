package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import src.RendimentoBruto;

class TstRendimentoBruto {
	
	private double i;
	private double p;
	private double n;
	private static double rb;
	
	public TstRendimentoBruto(double i, double p, double n) {
		this.i = i;
		this.p = p;
		this.n = n;
	}
	
	@Test
	void testRendimentoBruto() {
		RendimentoBruto rb = RendimentoBruto.gerarRendimentoBruto(0.08, 500, 120/360);
		assertEquals(13.2, RendimentoBruto.gerarRendimentoBruto(0.08, 500, 120/360));
	}

}
