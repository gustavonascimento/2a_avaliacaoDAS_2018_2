package test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import src.RendimentoBruto;

class TstImposto {

	@Test
	void testImposto() {
		assertEquals(35.51, RendimentoBruto.gerarImposto(240, 3000.0, 9.0), 0.01);
	}

}
