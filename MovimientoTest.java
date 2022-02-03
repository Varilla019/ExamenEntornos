package cuentas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MovimientoTest {

	static Movimiento m;
	
	@BeforeEach
	void setUp() throws Exception {
		m = new Movimiento();
	}

	@Test
	void testSetImporte() {
		m.setImporte(10);
		m.setConcepto("Bicicleta");
		
		assertEquals(10,m.getImporte());
		assertEquals("Bicicleta",m.getConcepto());
	}

}
