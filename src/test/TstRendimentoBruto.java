package test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import src.RendimentoBruto;

class TstRendimentoBruto {
	
	
	@Test
	void testRendimentoBruto() {
		RendimentoBruto rb = new RendimentoBruto();
		assertEquals(13.15, rb.gerarRendimentoBruto(120, 500.00, 8.0), 0.01);
	}

}
