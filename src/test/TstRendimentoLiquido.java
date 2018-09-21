package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import src.RendimentoBruto;

class TstRendimentoLiquido {
	
	@Test
	void testRendimentoLiquido() {
		assertEquals(1.0829, RendimentoBruto.gerarRendimentoLiquido(60, 1000.0, 8.5), 0.00005);
	}

}
